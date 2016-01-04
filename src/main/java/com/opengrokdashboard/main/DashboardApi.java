package com.opengrokdashboard.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DashboardApi {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApi.class, args);
    }
}
