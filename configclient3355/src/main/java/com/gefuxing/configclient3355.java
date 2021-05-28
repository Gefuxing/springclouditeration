package com.gefuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author gefuxing
 * @create 2021/5/26 14:02
 */
@SpringBootApplication
@EnableEurekaClient
public class configclient3355 {
    public static void main(String[] args) {
        SpringApplication.run(configclient3355 .class,args);
    }
}
