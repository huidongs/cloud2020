package pers.huidong.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Desc:
 */
@Mapper
public interface StorageDao {
    //修改库存
    void decrease(@Param("commodityCode")String commodityCode,@Param("count")Integer count);
}
