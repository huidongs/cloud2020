package pers.huidong.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import jdk.nashorn.internal.ir.Block;
import pers.huidong.springcloud.entities.CommonResult;
import pers.huidong.springcloud.entities.Payment;

/**
 * @Desc:
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException e){
        return new CommonResult(444,"按客户自定义 global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(444,"按客户自定义 global handlerException----2");
    }
}
