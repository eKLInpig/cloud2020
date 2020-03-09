package com.pig.springcloud.dao;

import com.pig.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author eklin
 * @create 2020-03-09 11:23
 */
@Mapper
public interface OrderDao {

    // 1 新建订单
    void create(Order order);

    // 2 修改订单状态，从零为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
