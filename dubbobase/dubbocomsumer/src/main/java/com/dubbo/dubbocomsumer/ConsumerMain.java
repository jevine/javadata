package com.dubbo.dubbocomsumer;

import com.dubbo.dubbocomsumer.impl.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author : JJZheng
 * @create 2021/8/15 13:16
 */
public class ConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("comsumerDubbo.xml");
        OrderService orderService= applicationContext.getBean(OrderService.class);
        for (int i = 0; i <20 ; i++) {
            String temp=orderService.doOrderInfo();
            System.out.println(temp);
            System.out.println("jjjjjjjj");

        }
        System.in.read();
    }
}
