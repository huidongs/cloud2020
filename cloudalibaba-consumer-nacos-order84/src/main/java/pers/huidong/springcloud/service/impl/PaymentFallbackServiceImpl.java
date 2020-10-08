package pers.huidong.springcloud.service.impl;

import org.springframework.stereotype.Component;
import pers.huidong.springcloud.entities.CommonResult;
import pers.huidong.springcloud.entities.Payment;
import pers.huidong.springcloud.service.PaymentService;

/**
 * @Desc:
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级--PaymentFallbackServiceImpl",new Payment(id,"errorSerial"));
    }
}
