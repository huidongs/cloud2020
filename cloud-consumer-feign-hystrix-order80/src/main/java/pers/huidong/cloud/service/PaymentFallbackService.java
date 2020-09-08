package pers.huidong.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Desc:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService--fallback-----ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return"PaymentFallbackService--fallback-------timeout";
    }
}
