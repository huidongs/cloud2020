package pers.huidong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/30 20:21
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("server.port")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
