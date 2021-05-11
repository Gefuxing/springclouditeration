package com.gefuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author gefuxing
 * @create 2021/5/11 16:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class consume4 {
    public static void main(String[] args) {
        SpringApplication.run(consume4.class, args);
    }
}