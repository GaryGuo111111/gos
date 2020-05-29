package com.taimei.gos.portal;

import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.AdminExample;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
class GosMbgApplicationTests {
	@Autowired
	private AdminMapper adminMapper;

	@Resource
	private RocketMQTemplate rocketMQTemplate;

	@Resource(name = "extRocketMQTemplate")
	private RocketMQTemplate extRocketMQTemplate;

	@Value("${demo.rocketmq.topic}")
	private String topic;

	private String springTransTopic;
	@Value("${demo.rocketmq.topic}")

	@Test
	void contextLoads() {
		AdminExample adminExample = new AdminExample();
		adminExample.createCriteria().andAdminIdEqualTo(1);
		long l = adminMapper.countByExample(adminExample);
		System.out.println(l);
	}

	@Test
	void testRocketMQ() {
		// Send string
//		SendResult sendResult = rocketMQTemplate.syncSend(topic, "Hello, World!");
//		System.out.printf("syncSend1 to topic %s sendResult=%s %n", topic, sendResult);

		// Use the extRocketMQTemplate
//		SendResult sendResult = extRocketMQTemplate.syncSend(topic, MessageBuilder.withPayload("Hello, World!2222".getBytes()).build());
//		System.out.printf("extRocketMQTemplate.syncSend1 to topic %s sendResult=%s %n", "string-topic", sendResult);

//		rocketMQTemplate.asyncSend("orderPaidTopic", "测试", new SendCallback() {
//			@Override
//			public void onSuccess(SendResult var1) {
//				System.out.printf("async onSucess SendResult=%s %n", var1);
//			}
//
//			@Override
//			public void onException(Throwable var1) {
//				System.out.printf("async onException Throwable=%s %n", var1);
//			}
//
//		});
		this.testRocketMQTemplateTransaction();
	}

		private void testRocketMQTemplateTransaction(){
			String[] tags = new String[] {"TagA", "TagB", "TagC", "TagD", "TagE"};
			for (int i = 0; i < 10; i++) {
				try {

					Message msg = MessageBuilder.withPayload("rocketMQTemplate transactional message " + i).
							setHeader(RocketMQHeaders.TRANSACTION_ID, "KEY_" + i).build();
					SendResult sendResult = rocketMQTemplate.sendMessageInTransaction(
							springTransTopic ,":" + tags[i % tags.length], msg,null );
					System.out.printf("------rocketMQTemplate send Transactional msg body = %s , sendResult=%s %n",
							msg.getPayload(), sendResult.getSendStatus());

					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

//	@RocketMQTransactionListener(rocketMQTemplateBeanName = "extRocketMQTemplate")
//	class ExtTransactionListenerImpl implements RocketMQLocalTransactionListener {
//		@Override
//		public RocketMQLocalTransactionState executeLocalTransaction(Message msg, Object arg) {
//			System.out.printf("ExtTransactionListenerImpl executeLocalTransaction and return UNKNOWN. \n");
//			return RocketMQLocalTransactionState.UNKNOWN;
//		}
//
//		@Override
//		public RocketMQLocalTransactionState checkLocalTransaction(Message msg) {
//			System.out.printf("ExtTransactionListenerImpl checkLocalTransaction and return COMMIT. \n");
//			return RocketMQLocalTransactionState.COMMIT;
//		}
//	}

