package com.gefuxing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author gefuxing
 * @create 2021/5/11 16:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class payment4 {
    public static void main(String[] args) {
        SpringApplication.run(payment4.class, args);
    }

}


