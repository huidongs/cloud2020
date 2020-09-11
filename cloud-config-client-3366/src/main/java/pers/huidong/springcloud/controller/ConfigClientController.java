package pers.huidong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/11 21:15
 * @Version: 1.0
 */
@RestController
@RefreshScope   //curl -X POST "http://localhost:3355/actuator/refresh"
public class ConfigClientController {
    @Value(("${config.info}"))
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
