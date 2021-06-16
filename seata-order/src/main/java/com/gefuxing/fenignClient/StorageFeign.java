package com.gefuxing.fenignClient;

import com.gefuxing.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:20
 */
@Component
@FeignClient(value = "seata-storage-service")
public interface StorageFeign {

    @GetMapping("/storage")
    public CommonResult changeStorage(
            @RequestParam("productId") Long productId,
            @RequestParam("count") Integer  count
    );
}
