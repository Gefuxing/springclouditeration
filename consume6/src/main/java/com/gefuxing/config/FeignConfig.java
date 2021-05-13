package com.gefuxing.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author gefuxing
 * @create 2021/5/13 10:25
 */
@Configuration
public class FeignConfig {
//设置日志级别
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
