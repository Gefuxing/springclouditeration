package com.gefuxing.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gefuxing
 * @create 2021/5/26 19:11
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${gfx.name}")
    private String info ;


    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return info;
    }
}
