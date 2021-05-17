package com.gefuxing.com;

import org.springframework.stereotype.Component;

/**
 * @Author gefuxing
 * @create 2021/5/13 16:51
 */@Component
public class FallBackMethor implements PaymentServiceClient {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
