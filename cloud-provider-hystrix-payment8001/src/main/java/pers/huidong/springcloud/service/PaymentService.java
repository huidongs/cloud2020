package pers.huidong.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/7 22:09
 * @Version: 1.0
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentinfo_ok,id:"+id;
    }

    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try{
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentinfo_ok,id:"+id+"耗时(s)："+timeNumber;

    }
}
