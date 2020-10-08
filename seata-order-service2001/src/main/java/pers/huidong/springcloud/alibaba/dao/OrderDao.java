package pers.huidong.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.huidong.springcloud.alibaba.domain.Order;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 22:24
 * @Version: 1.0
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);
    //2 修改订单状态，从零改为1
    void update(@Param("userId") String userId,@Param("status")Integer status);
}
