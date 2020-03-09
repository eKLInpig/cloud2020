package com.pig.springcloud.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author eklin
 * @create 2020-03-09 13:41
 */
public interface AccountService {

    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
