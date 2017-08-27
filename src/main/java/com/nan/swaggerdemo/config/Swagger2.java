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
        ApiInfo apiInfo = new ApiInfoBuilder().title("Spring Boot 整合 swagger ui")
                .description("Spring Boot 整合 swagger ui项目")
                .license("MIT")
                .licenseUrl("http://opensource.org/licenses/MIT")
                .contact(new Contact("王金楠", "http://blog.csdn.net/wangjinnan16/article", "wangjinnan16@163.com"))
                .version("1.0")
                .build();
        return apiInfo;
    }

}  