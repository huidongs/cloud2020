package pers.huidong.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springcloud.alibaba.domain.CommonResult;
import pers.huidong.springcloud.alibaba.service.AccountService;

import javax.annotation.Resource;

/**
 * @Desc:
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Integer userId,Integer money){

        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户成功");

    }
}
