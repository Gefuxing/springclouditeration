package com.gefuxing.fenignClient;

import com.gefuxing.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:20o
 */
@Component
@FeignClient(value = "seata-account-service")
public interface AccountFeign {

    @GetMapping("/getaccount")
    public CommonResult getAccount(
            @RequestParam("userId") Long userId,
            @RequestParam("money") BigDecimal money);


}
