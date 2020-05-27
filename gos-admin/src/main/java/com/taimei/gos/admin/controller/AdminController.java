package com.taimei.gos.admin.controller;

import com.taimei.gos.admin.dto.AdminLoginParam;
import com.taimei.gos.admin.dto.AdminParam;
import com.taimei.gos.admin.service.AdminService;
import com.taimei.gos.common.api.CommonResult;
import com.taimei.gos.model.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
@Api(tags = "AdminController", description = "后台用户管理")
public class AdminController {

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Admin> register(@RequestBody AdminParam adminParam, BindingResult result) {
        Admin umsAdmin = adminService.register(adminParam);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody AdminLoginParam adminLoginParam, BindingResult result) {
        int a = 1/0;
        String token = adminService.login(adminLoginParam.getUserName(), adminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

}
