package com.benghuai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Gateway9527app {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527app.class,args);
    }
}
