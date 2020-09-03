package pers.huidong.springcloud.service;

import org.apache.ibatis.annotations.Param;
import pers.huidong.springcloud.entities.Payment;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/16 20:29
 * @Version: 1.0
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);

}
