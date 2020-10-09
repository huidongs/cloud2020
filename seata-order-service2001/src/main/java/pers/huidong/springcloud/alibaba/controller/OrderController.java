package pers.huidong.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springcloud.alibaba.domain.CommonResult;
import pers.huidong.springcloud.alibaba.domain.Order;
import pers.huidong.springcloud.alibaba.service.OrderService;

import javax.annotation.Resource;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 23:01
 * @Version: 1.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return  new CommonResult(200,"订单创建成功");
    }
}
