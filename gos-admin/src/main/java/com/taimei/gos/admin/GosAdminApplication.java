package com.taimei.gos.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.taimei.gos")
public class GosAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(GosAdminApplication.class, args);
    }

}
