package com.gefuxing.config;

/**
 * @Author gefuxing
 * @create 2021/6/11 11:34
 */
import com.gefuxing.controller.MyHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "myHandler").setAllowedOrigins("*");
    }
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }

}