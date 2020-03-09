package com.pig.springcloud.service;

/**
 * @author eklin
 * @create 2020-03-09 13:23
 */
public interface StorageService {

    void decrease(Long productId, Integer count);
}
