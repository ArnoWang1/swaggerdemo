package com.nan.swaggerdemo.request;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserRequest implements Serializable {

    @ApiModelProperty(value = "用户名称", example = "admin")
    private String name;

    @ApiModelProperty(value = "时间", example = "2017-11-16 10:00:00")
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public UserRequest(String name, String time) {
        this.name = name;
        this.time = time;
    }
}
