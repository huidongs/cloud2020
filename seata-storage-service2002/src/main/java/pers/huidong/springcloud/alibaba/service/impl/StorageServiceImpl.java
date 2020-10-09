package pers.huidong.springcloud.alibaba.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pers.huidong.springcloud.alibaba.dao.StorageDao;
import pers.huidong.springcloud.alibaba.service.StorageService;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * @Desc:
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
  //  private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(StorageServiceImpl.class);
    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(String commodityCode, Integer count) {
        log.info("-----扣减库存开始");
        storageDao.decrease(commodityCode,count);
        log.info("-----扣减库存结束");

    }
}
