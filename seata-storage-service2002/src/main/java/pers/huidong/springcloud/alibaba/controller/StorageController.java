package pers.huidong.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springcloud.alibaba.domain.CommonResult;
import pers.huidong.springcloud.alibaba.service.StorageService;

import javax.annotation.Resource;

/**
 * @Desc:
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(String commodityCode,Integer count){
        storageService.decrease(commodityCode,count);
        return new CommonResult(200,"扣减库存成功");
    }
}
