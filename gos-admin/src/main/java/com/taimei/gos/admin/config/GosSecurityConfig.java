package com.taimei.gos.admin.config;

import com.taimei.gos.security.config.SecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * mall-security模块相关配置
 * Created by macro on 2019/11/5.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GosSecurityConfig extends SecurityConfig {
//
//    @Autowired
//    private UmsMemberService memberService;
//
//    @Override
//    @Bean
//    public UserDetailsService userDetailsService() {
//        //获取登录用户信息
//        return username -> memberService.loadUserByUsername(username);
//    }
}
