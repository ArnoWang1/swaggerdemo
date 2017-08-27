package com.nan.swaggerdemo.controller;

import com.google.common.collect.Lists;
import com.nan.swaggerdemo.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @ApiOperation(value = "查询用户API", notes = "按条件查询用户信息", responseContainer = "List", response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pathParam", value = "url路径参数",
                    required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "queryParam", value = "普通请求参数",
                    required = true, dataType = "int", paramType = "query")
    })
    @RequestMapping(value = "/users/{pathParam}", method = {RequestMethod.GET, RequestMethod.POST})
    List<User> users(@PathVariable("pathParam") String pathParam, String queryParam) {
        System.err.println("pathParam = " + pathParam);
        System.err.println("queryParam = " + queryParam);
        return Lists.newArrayList(new User(1L, "user1", 21), new User(2L, "user2", 22));
    }

}
