package com.taimei.gos.portal.service;

import com.taimei.gos.mapper.UserMapper;
import com.taimei.gos.mapper.UserWechatMapper;
import com.taimei.gos.model.User;
import com.taimei.gos.model.UserWechat;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RocketMQMessageListener(topic = "${demo.rocketmq.topic}", consumerGroup = "user_consumer")
public class HelloWorldService implements RocketMQListener<String>{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserWechatMapper userWechatMapper;

    @Override
    public void onMessage(String message) {
        System.out.printf("-------我正在消费了 StringConsumer received: %s \n", message);
    }

    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT, readOnly = false, timeout = -1)
    public void testTransactional() {
        User user = new User();
        user.setMobile("13826172865");
        user.setIsDelete((byte) 0);
        user.setParentId(1);
        int insert = userMapper.insert(user);
        int i = 100/0;
        UserWechat userWechat = new UserWechat();
        userWechat.setUserId(insert);
        userWechat.setAppId("asdfajslfas");
        userWechatMapper.insert(userWechat);

    }

}
