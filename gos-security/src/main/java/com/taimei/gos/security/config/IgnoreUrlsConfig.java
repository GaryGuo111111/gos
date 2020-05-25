package com.taimei.gos.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于配置不需要保护的资源路径
 * Created by macro on 2018/11/5.
 */
@Getter
@Setter
/**
 * 如果不加@EnableConfigurationProperties, @ConfigurationProperties会爆红
 */
@EnableConfigurationProperties({IgnoreUrlsConfig.class})
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}
