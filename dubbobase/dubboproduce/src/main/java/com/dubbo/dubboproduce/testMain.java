package com.dubbo.dubboproduce;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author : JJZheng
 * @create 2021/8/14 23:29
 */
public class testMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("produceDubbo1.xml");
        ioc.start();
        System.in.read();
    }
}
