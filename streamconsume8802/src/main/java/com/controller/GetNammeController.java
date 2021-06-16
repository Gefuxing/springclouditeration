package com.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.service.mqservice1;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author gefuxing
 * @create 2021/6/3 11:23
 */

@RestController
public class GetNammeController {

    @Resource
    private mqservice1 mqservice11;
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/getName/{name}")
    public String getName(@PathVariable("name") String name) {
        return mqservice11.getName(name);

    }
    @GetMapping("/getName/r/{name}")
    public String getName1(@PathVariable("name") String name) {
        String forObject = restTemplate.getForObject("http://localhost:8801/getName/" + name, String.class);
        return forObject;
    }

}

