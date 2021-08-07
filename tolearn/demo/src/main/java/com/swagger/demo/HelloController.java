package com.swagger.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : JJZheng
 * @create 2021/6/25 23:05
 */
@RequestMapping("/zjj")
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
