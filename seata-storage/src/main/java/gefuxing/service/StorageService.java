package gefuxing.service;

import gefuxing.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:06
 */
public interface StorageService {

    CommonResult changeStorage(Long productId, Integer count);
}
