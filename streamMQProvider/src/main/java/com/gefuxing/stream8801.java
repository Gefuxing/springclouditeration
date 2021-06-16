package com.gefuxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author gefuxing
 * @create 2021/6/2 17:10
 */
@SpringBootApplication
@EnableEurekaClient
public class stream8801 {
        public static void main(String[] args) {
            SpringApplication.run(stream8801.class, args);
        }

}
