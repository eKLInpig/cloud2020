package com.pig.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author eklin
 * @create 2020-03-05 14:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404 not_found
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }

}
