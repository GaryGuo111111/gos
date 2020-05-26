package com.taimei.gos.admin.config;

import com.taimei.gos.admin.service.AResourceService;
import com.taimei.gos.admin.service.AdminService;
import com.taimei.gos.model.AResource;
import com.taimei.gos.security.component.DynamicSecurityService;
import com.taimei.gos.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * mall-security模块相关配置
 * Created by macro on 2019/11/5.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GosSecurityConfig extends SecurityConfig {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AResourceService aResourceService;

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> adminService.loadUserByUsername(username);
    }

    @Bean
    public DynamicSecurityService dynamicSecurityService() {
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() {
                Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
                List<AResource> resourceList = aResourceService.listAll();
                for (AResource resource : resourceList) {
                    map.put(resource.getAction(), new org.springframework.security.access.SecurityConfig(resource.getaResourceId() + ":" + resource.getResourceName()));
                }
                return map;
            }
        };
    }
}
