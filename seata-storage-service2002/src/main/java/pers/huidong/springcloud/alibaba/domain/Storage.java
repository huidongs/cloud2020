package pers.huidong.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * @Desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Long id;
    private String commodityCode;
    private Integer count;
    private Integer used;
    private Integer residue;

}
