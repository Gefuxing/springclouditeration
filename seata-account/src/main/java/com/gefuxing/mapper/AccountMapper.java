package com.gefuxing.mapper;

import com.gefuxing.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:02
 */
@Mapper
public interface AccountMapper {

    void update(@Param("userId") Long userId, @Param("money")BigDecimal money);

}
