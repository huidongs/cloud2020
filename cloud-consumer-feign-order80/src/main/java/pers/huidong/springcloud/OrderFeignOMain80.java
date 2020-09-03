package pers.huidong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Desc:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignOMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignOMain80.class,args);
    }
}
