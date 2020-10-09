package pers.huidong.springcloud.alibaba.service;

import org.springframework.stereotype.Service;

/**
 * @Desc:
 */
public interface AccountService {
    void decrease(Integer userId, Integer money);
}
