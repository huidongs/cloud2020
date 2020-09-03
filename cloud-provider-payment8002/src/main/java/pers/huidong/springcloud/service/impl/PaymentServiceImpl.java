package pers.huidong.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.huidong.springcloud.dao.PaymentDao;
import pers.huidong.springcloud.entities.Payment;
import pers.huidong.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/16 20:30
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
