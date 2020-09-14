package pers.huidong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/14 19:26
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args){
         SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
