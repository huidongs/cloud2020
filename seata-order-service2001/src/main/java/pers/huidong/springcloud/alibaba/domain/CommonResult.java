package pers.huidong.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: HuiDong XU
 * @Description:
 * @Date: 2020/10/8 22:21
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;


    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}