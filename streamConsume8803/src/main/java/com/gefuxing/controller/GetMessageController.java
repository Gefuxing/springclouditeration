package com.gefuxing.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author gefuxing
 * @create 2021/6/3 11:23
 */

@RestController
@EnableBinding(Sink.class)
public class GetMessageController
{
//    @Resource
//    private mqservice mqservice1;
//    @Resource
//    private mqserviceImpl mqserviceImpl1;

    @Value("${server.port}")
    private String serverPort;
//    @GetMapping(value = "/sendMessage")
//    public String sendMessage()
//    {
//        return mqservice1.send();
//    }


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者2号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);
        //return message.getPayload();
    }
}

