package com.gefuxing.controller;

import com.gefuxing.service.mqservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author gefuxing
 * @create 2021/6/3 11:23
 */
@RestController
public class SendMessageController
{
    @Resource
    private mqservice mqservice1;
    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return mqservice1.send();
    }


    @GetMapping(value = "/getName/{name}")
    public String getName(@PathVariable String name)
    {
        return mqservice1.getName(name);
    }
}

