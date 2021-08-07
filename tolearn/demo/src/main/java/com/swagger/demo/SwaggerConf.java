package com.swagger.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author : JJZheng
 * @create 2021/6/26 11:38
 */
@Configuration
public class SwaggerConf {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().
                apis(RequestHandlerSelectors.basePackage("com.swagger.demo"))
                //any return Predicates.alwaysTrue();
                //none return Predicates.alwaysFalse()
                //basePackage() return 该包下的接口
                //withMethodAnnotation return new Predicate<RequestHandler>() {
                //            public boolean apply(RequestHandler input) {
                //                return input.isAnnotatedWith(annotation);
                //            }
                //        };
                //withClassAnnotation return 含有某注解的类下的接口
                .paths(PathSelectors.ant("/zjj1/**"))
                //any return Predicates.alwaysTrue();
                //none return Predicates.alwaysFalse();
                //regex return input.matches(pathRegex); 正则表达式
                //ant return 请求路径下的接口
                .build();
    }
    public ApiInfo apiInfo(){
       return new ApiInfo("doc share",
               "Api doc by zjj",
               "1.220", "urn:tos",
               new Contact("zjj", "", "11"), "Apache 2.0",
               "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
}
