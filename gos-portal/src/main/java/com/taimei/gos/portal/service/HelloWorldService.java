package com.taimei.gos.portal.service;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "${demo.rocketmq.topic}", consumerGroup = "user_consumer")
public class HelloWorldService implements RocketMQListener<String>{

    @Override
    public void onMessage(String message) {
        System.out.printf("-------我正在消费了 StringConsumer received: %s \n", message);
    }

}
