package pers.huidong.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Desc:
 */
@Mapper
public interface AccountDao {
    void decrease(@Param("userId") Integer userId, @Param("money")Integer money);
}
