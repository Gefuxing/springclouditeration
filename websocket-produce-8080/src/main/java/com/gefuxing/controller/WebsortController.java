package com.gefuxing.controller;

import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;
import java.net.URI;

/**
 * @Author gefuxing
 * @create 2021/6/11 13:27
 */
public class WebsortController {

    public static void main(String[] args) {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            MyClient client = new MyClient();
            container.connectToServer(client, new URI("ws://127.0.0.1:8081/myHandler"));
//            container.setDefaultMaxSessionIdleTimeout(5000L);
            int turn = 0;
            while(turn++ < 100){
                client.send("client send: 客户端消息 " + turn);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
