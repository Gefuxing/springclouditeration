package com.gefuxing.springcloud.mapper;

import com.gefuxing.springcloud.entities.Payment;import org.apache.ibatis.annotations.Param;

/**
 * @Author gefuxing
 * @create 2021/5/10 17:01
 */
public interface PaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

    Payment select(@Param("id") Long id);
}