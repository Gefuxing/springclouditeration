package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author gefuxing
 * @create 2021/5/10 17:51
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka1 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka1.class,args);
    }
}
