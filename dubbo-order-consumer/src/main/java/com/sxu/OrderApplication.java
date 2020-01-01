package com.sxu;

import com.sxu.controller.OrderController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author jyw
 * @date 2020/1/1-17:00
 */
public class OrderApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        OrderController orderController = applicationContext.getBean(OrderController.class);
        orderController.sayHello("张三");
        System.in.read();

    }

}
