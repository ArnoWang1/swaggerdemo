package com.nan.swaggerdemo.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户信息
 */
public class Contact implements Serializable {

    @ApiModelProperty(value = "用户手机", example = "15641656546")
    private String phone;

    @ApiModelProperty(value = "用户邮箱", example = "zhangsan@163.com")
    private Integer email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }
}
