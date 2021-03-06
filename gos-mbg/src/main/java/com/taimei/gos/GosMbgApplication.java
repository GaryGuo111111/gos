package com.taimei.gos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.taimei.gos.mapper"})
public class GosMbgApplication {

	public static void main(String[] args) {
		SpringApplication.run(GosMbgApplication.class, args);
	}

}
