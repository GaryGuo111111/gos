package com.taimei.gos.portal;

import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.taimei.gos")
public class GosPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GosPortalApplication.class, args);
	}

}
