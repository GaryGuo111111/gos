package com.taimei.gos.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.taimei.gos.mapper","com.taimei.gos.search.dao"})
public class MyBatisConfig {
}
