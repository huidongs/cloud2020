package pers.huidong.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc:
 */
@Configuration
public class FeignConfig {


    @Bean
    Logger.Level feignLevel(){
        return Logger.Level.FULL;
    }
}
