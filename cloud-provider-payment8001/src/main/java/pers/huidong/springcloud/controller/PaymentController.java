package pers.huidong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.huidong.springcloud.entities.CommonResult;
import pers.huidong.springcloud.entities.Payment;
import pers.huidong.springcloud.service.PaymentService;


import javax.annotation.Resource;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/16 20:37
 * @Version: 1.0
 */
@Controller
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else{
            return new CommonResult<>(444,"出入数据库失败",null);
        }
    }

    @ResponseBody
    @GetMapping(value = "/payment/get{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果："+payment);
        if (payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"没有对应记录，查询ID:"+id,null);
        }
    }
}
