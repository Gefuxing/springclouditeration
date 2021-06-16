package com.gefuxing.service.Impl;

import com.gefuxing.service.mqservice;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author gefuxing
 * @create 2021/6/3 11:17
 */
@EnableBinding(Source.class)
public class mqserviceImpl implements mqservice {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return "ok";
    }

    @Override
    public String getName(String name) {

        return  name;
    }

}
