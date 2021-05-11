package com.gefuxing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Author gefuxing
 * @create 2021/4/5 19:29
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class PaymentApplication3 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication3.class, args);
    }
}
