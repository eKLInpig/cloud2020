package com.pig.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author eklin
 * @create 2020-03-09 11:59
 */
@Configuration
@MapperScan({"com.pig.springcloud.dao"})
public class MyBatisConfig {
}
