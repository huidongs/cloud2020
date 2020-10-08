package pers.huidong.springcloud.alibaba.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pers.huidong.springcloud.alibaba.dao.OrderDao;
import pers.huidong.springcloud.alibaba.domain.Order;
import pers.huidong.springcloud.alibaba.service.AccountService;
import pers.huidong.springcloud.alibaba.service.OrderService;
import pers.huidong.springcloud.alibaba.service.StorageService;

import javax.annotation.Resource;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 22:43
 * @Version: 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("---开始新建订单");
        orderDao.create(order);
        log.info("---订单微服务开始调用库存，做扣减count");
        storageService.decrease(order.getCommodityCode(),order.getCount());
        log.info("---订单微服务开始调用库存，做扣减end");

        log.info("---订单微服务开始调用账户，做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("---订单微服务开始调用账户，做扣减end");

        //4修改订单状态，从0到1
        log.info("修改订单状态stater");
        orderDao.update(order.getUserId(),1);
        log.info("修改订单状态finish");

        log.info("全部结束");

    }

}
