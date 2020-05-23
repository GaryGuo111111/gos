package com.taimei.gos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.taimei.gos")
public class GosMbgApplication {

	public static void main(String[] args) {
		SpringApplication.run(GosMbgApplication.class, args);
	}

}
