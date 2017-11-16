package com.nan.swaggerdemo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nan.swaggerdemo.controller")) //扫描包下面
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) //扫描有此注解的方法
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder().title("蛙鸣用户模块API文档")
                .description("蛙鸣用户添加，用户查询，权限认证模块API文档，异常统一信息" +
                        "\"AjaxResult\": {\n" +
                        "      \"code\": \"1003\",\n" +
                        "      \"msg\": \"参数可是错误\"\n" +
                        "    },")
                .license("MIT")
                .licenseUrl("http://opensource.org/licenses/MIT")
                .contact(new Contact("蛙鸣", "http://waming-air.com/", "wangjinnan16@163.com"))
                .version("1.0.8")
                .build();
        return apiInfo;
    }

}  