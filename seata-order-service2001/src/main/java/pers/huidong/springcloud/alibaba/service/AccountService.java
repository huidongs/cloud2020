package pers.huidong.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.huidong.springcloud.alibaba.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 22:44
 * @Version: 1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") String commodityCode, @RequestParam("money") BigDecimal count);
}
