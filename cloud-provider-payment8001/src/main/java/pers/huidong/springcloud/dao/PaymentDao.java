package pers.huidong.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pers.huidong.springcloud.entities.Payment;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/16 19:59
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
