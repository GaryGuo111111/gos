package com.taimei.gos.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 用户登录参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class AdminParam {
    @ApiModelProperty(value = "手机号码", required = true)
    @NotEmpty(message = "手机号码")
    private String userName;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "真实姓名", required = true)
    @NotEmpty(message = "真实姓名不能为空")
    private String realName;
}
