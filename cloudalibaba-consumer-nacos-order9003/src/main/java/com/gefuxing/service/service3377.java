package com.gefuxing.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author gefuxing
 * @create 2021/6/12 14:37
 */
@Component
@FeignClient(value = "nacos-config-client",fallback = fallback.class)
public interface service3377 {

    @GetMapping("/testc")
    public String testc(@RequestParam ("p1")String p1,@RequestParam ("p2") String p2);
}
