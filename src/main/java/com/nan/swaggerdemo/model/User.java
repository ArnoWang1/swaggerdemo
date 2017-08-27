package com.nan.swaggerdemo.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户信息
 */
public class User implements Serializable {

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户名称")
    private String name; //用户名称

    @ApiModelProperty("用户年龄")
    private Integer age; //用户年龄

    public User() {
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
