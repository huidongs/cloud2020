package pers.huidong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 */
@RestController
@RefreshScope   //curl -X POST "http://localhost:3355/actuator/refresh"    //bus-refresh
public class ConfigClientController {

    @Value(("${server.port}"))
    private String serverPort;
    @Value(("${config.info}"))
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "serverPort:"+serverPort+"\t\n\n configInfo:"+configInfo;
    }

}
