package pers.huidong.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.NullValueInNestedPathException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pers.huidong.springcloud.entities.CommonResult;
import pers.huidong.springcloud.entities.Payment;
import pers.huidong.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/13 22:19
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String SERVICE_URL;

    @RequestMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback")//没有配置
//    @SentinelResource(value = "fallback",fallback = "handlerFallback")//只负责业务异常
//    @SentinelResource(value = "fallback",blockHandler = "blockHandler")//只负责sentinel控制台配置违规
    @SentinelResource(value = "fallback",blockHandler = "blockHandler",fallback = "handlerFallback")//各自都正常，当两者都捕获时以sentinel为准
    public CommonResult<Payment> fallback(@PathVariable("id")Long id){
        String url = SERVICE_URL+"/paymentSQL/"+id;
        System.out.println(url);
        CommonResult result = restTemplate.getForObject(url,CommonResult.class,id);
        if (id==4){
            throw new IllegalArgumentException("IllegalArgumentException,非法参数异常");
        }else if(result.getData()==null) {
            throw new NullPointerException("NullPointerException,空指针异常");
        }
        return result;
    }

    //本例是fallback
    public CommonResult handlerFallback(@PathVariable("id")Long id,Throwable e){

        Payment payment = new Payment(id,null);
        return new CommonResult(444,"fallback方法"+e.getMessage(),payment);
    }
    //本例是blockhandler
    public CommonResult blockHandler(@PathVariable("id")Long id, BlockException e){

        Payment payment = new Payment(id,null);
        return new CommonResult(445,"blockHandler方法"+e.getMessage(),payment);
    }
//=====================================openFeign====================================
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "consumer/openfeign/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id")Long id){
        return paymentService.paymentSQL(id);
    }
}
