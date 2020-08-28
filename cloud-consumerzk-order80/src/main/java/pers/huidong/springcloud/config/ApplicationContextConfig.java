package pers.huidong.springcloud.config;

import org.omg.CORBA.FREE_MEM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/28 23:32
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
