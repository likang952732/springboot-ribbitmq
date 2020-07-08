package com.example.springbootrabbitmq.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

/*
 @Description 用户登录参数
 *@author kang.li
 *@date 2020/7/2 9:30   
 */
@Data
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "用户名", required = true)
    //@NotEmpty(message = "用户名不能为空")
    @NonNull
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    //@NotEmpty(message = "密码不能为空")
    @NonNull
    private String password;
}
