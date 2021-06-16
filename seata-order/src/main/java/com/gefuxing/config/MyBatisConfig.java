package com.gefuxing.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.gefuxing.mapper"})
public class MyBatisConfig {

}