package pers.huidong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/13 22:17
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
    public static void main(String[] args){
         SpringApplication.run(OrderNacosMain83.class,args);
    }
}
