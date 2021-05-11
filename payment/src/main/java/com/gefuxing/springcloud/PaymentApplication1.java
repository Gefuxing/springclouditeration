package com.gefuxing.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author gefuxing
 * @create 2021/4/5 19:29
 */

@MapperScan("com.gefuxing.springcloud.mapper")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication1.class, args);
    }
}
