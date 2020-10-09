package pers.huidong.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 22:22
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private BigDecimal money;
    private Integer status;  //订单状态：0 创建中，1 已完结
}
