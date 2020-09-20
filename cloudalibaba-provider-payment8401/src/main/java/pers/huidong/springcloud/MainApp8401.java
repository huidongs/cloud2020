package pers.huidong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/20 15:01
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
    public static void main(String[] args){
         SpringApplication.run(MainApp8401.class,args);
    }
}
