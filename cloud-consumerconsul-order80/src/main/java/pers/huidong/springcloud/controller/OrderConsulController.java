package pers.huidong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/30 22:11
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL="http://cloud-prodiverconsul-payment";

    @Autowired
    private RestTemplate restTemplate;

    @LoadBalanced
    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }
}
