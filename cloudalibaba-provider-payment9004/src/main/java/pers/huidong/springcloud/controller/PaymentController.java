package pers.huidong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springcloud.entities.CommonResult;
import pers.huidong.springcloud.entities.Payment;

import java.util.HashMap;

/**
 * @Desc:
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"asdfeadijafeafdka1111"));
        hashMap.put(2L,new Payment(2L,"asdfeadijafeafdka2222"));
        hashMap.put(3L,new Payment(3L,"asdfeadijafeafdka3333"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id")Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200,"from mysql,serverPort:"+serverPort,payment);
        return result;
    }
}
