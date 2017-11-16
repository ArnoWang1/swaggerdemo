package com.nan.swaggerdemo.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 用户信息
 */
public class User implements Serializable {

    @ApiModelProperty(value = "用户id", example = "23", required = true)
    private Long id;

    @ApiModelProperty(value = "用户名称", example = "张三", required = true)
    private String name; //用户名称

    @ApiModelProperty(value = "用户年龄", example = "23")
    private Integer age; //用户年龄

    private Contact contact;

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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
