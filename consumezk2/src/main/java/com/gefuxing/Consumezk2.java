package com.gefuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author gefuxing
 * @create 2021/5/11 15:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumezk2 {
    public static void main(String[] args) {
        SpringApplication.run(Consumezk2.class, args);
    }
}
