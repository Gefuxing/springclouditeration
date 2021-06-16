package com.gefuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author gefuxing
 * @create 2021/6/14 21:12
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class OrderMain2001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain2001.class, args);
    }
}
