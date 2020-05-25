package com.taimei.gos.portal.controller;

import com.taimei.gos.common.api.CommonResult;
import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("helloWorld")
@Api(tags = "HelloWorldController")
public class HelloWorldController {
    @Autowired
    private AdminMapper adminMapper;

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
}
