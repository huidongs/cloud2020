package pers.huidong.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/8/16 19:09
 * @Version: 1.0
 */
@Data  //注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
@AllArgsConstructor  //注解在类上；为类提供一个全参的构造方法
@NoArgsConstructor   //注解在类上；为类提供一个无参的构造方法
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
