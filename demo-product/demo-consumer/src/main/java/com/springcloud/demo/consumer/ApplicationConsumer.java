package com.springcloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.springcloud.demo")
@EnableTransactionManagement(proxyTargetClass = true)
public class ApplicationConsumer {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class, args);
    }
}
