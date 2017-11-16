package com.nan.swaggerdemo.controller;

import com.google.common.collect.Lists;
import com.nan.swaggerdemo.model.User;
import com.nan.swaggerdemo.request.UserRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "用户信息相关API文档")
@RestController
public class UserController {

    @ApiOperation(value = "查询用户API", notes = "按条件查询用户信息", responseContainer = "List", response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pathParam", value = "url路径参数，例如 hello",
                    required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "queryParam", value = "普通请求参数，例如 world",
                    required = true, dataType = "int", paramType = "query", defaultValue = "query")
    })
    @RequestMapping(value = "/users/{pathParam}", method = {RequestMethod.GET, RequestMethod.POST})
    List<User> findUser(@PathVariable("pathParam") String pathParam, String queryParam, @RequestBody UserRequest userRequest) {
        System.err.println("pathParam = " + pathParam);
        System.err.println("queryParam = " + queryParam);
        return Lists.newArrayList(new User(1L, "user1", 21), new User(2L, "user2", 22));
    }

}
