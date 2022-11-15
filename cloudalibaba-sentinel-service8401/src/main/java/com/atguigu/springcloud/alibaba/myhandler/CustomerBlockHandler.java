package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException e){
        return new CommonResult(444, "客户自定义,global handlerException----------1");
    }

    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(444, "客户自定义,global handlerException----------2");
    }

}
