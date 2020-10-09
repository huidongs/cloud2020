package pers.huidong.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.huidong.springcloud.alibaba.domain.CommonResult;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 22:45
 * @Version: 1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("commodityCode") String commodityCode,@RequestParam("count") Integer count);
}
