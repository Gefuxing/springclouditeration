package com.gefuxing.controller;

/**
 * @Author gefuxing
 * @create 2021/6/11 13:17
 */
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * 相当于controller的处理器
 */
public class MyHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        System.out.println(payload);
        session.sendMessage(new TextMessage("服务器返回收到的信息," + payload));
    }
}