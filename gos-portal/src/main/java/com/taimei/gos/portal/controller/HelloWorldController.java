package com.taimei.gos.portal.controller;

import com.taimei.gos.common.api.CommonResult;
import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.listener.Topic;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("helloWorld")
@Api(tags = "HelloWorldController")
public class HelloWorldController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;
    @Autowired
    private AdminMapper adminMapper;

    @Value("${demo.rocketmq.topic}")
    private String topic;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ApiOperation("sayHello")
    public String sayHello() {
        return "helloWord";
    }

    @RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
    @ApiOperation("新建后台管理用户")
    public CommonResult addAdmin(String userName, String password) {
        Admin admin = new Admin();
        admin.setUserName(userName);
        admin.setPassword(password);
        System.out.println(admin);
        System.out.println("adminMapper" + adminMapper);
        int count = adminMapper.insertSelective(admin);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    @ApiOperation("测试参数")
    public CommonResult test(@PathVariable Integer id) {
        return CommonResult.success(id);
    }

    @GetMapping("/syncNews")
    public String syncNews(){
        Message message = new Message();
        message.setBody("同步消息".getBytes());
        SendResult sendResult = rocketMQTemplate.syncSend(topic, message);
        // 同步消息发送成功会有一个返回值，我们可以用这个返回值进行判断和获取一些信息
        System.out.println(sendResult);
        return "success";
    }
}
