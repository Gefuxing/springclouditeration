package com.ge.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author gefuxing
 * @create 2021/5/12 16:29
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
