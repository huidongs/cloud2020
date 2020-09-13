package pers.huidong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/13 21:19
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
    public static void main(String[] args){
         SpringApplication.run(PaymentMain9001.class,args);
    }
}
