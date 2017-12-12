package com.wh.produce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Luncher {
    public static void main(String[] args) {
        SpringApplication.run(Luncher.class, args);
    }
}
