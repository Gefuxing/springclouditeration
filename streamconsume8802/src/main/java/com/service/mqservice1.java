package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author gefuxing
 * @create 2021/6/3 15:37
 */
@Component
@FeignClient(value = "CLOUD-STREAM-PROVIDER")
public interface mqservice1 {


    @GetMapping(value = "/getName/{name}")
    public String getName(@PathVariable("name") String name);
}
