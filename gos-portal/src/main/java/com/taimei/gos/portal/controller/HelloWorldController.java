package com.taimei.gos.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloWorld")
@Api(tags = "HelloWorldController")
public class HelloWorldController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ApiOperation("sayHello")
    public String sayHello() {
        return "helloWord";
    }
}
