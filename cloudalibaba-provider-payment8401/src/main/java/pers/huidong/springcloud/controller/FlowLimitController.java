package pers.huidong.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/9/20 15:02
 * @Version: 1.0
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "testA";
    }


    @GetMapping("/testB")
    public String testB() {
        return "testB";
    }
}
