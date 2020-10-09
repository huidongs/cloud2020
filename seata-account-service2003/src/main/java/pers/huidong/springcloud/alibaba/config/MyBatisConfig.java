package pers.huidong.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 23:05
 * @Version: 1.0
 */
@Configuration
@MapperScan({"pers.huidong.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
