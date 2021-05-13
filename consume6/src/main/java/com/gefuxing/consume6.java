package com.gefuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @Author gefuxing
 * @create 2021/5/12 17:57
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class consume6 {
    public static void main(String[] args) {
        SpringApplication.run(consume6.class, args);
    }
}