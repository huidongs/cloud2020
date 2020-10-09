package pers.huidong.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Desc:
 */

public interface StorageService {

    void decrease(String commodityCode,Integer count);
}
