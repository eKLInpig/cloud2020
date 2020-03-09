package com.pig.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author eklin
 * @create 2020-03-09 13:17
 */
@Mapper
public interface StorageDao {

    // 扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
