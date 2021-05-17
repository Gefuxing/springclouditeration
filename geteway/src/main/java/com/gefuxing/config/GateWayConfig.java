package com.gefuxing.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author gefuxing
 * @create 2021/5/17 16:33
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_ge", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("path_ge1", r -> r.path("/finance").uri("http://news.baidu.com/finance")).build();
        return routes.build();
    }
}

