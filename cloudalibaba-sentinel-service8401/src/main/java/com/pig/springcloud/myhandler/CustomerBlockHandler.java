package com.pig.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.pig.springcloud.entities.CommonResult;
import com.pig.springcloud.entities.Payment;

/**
 * @author eklin
 * @create 2020-03-08 20:54
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按客户自定，global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按客户自定，global handlerException----2");
    }


}
