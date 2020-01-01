package com.sxu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author jyw
 * @date 2020/1/1-15:58
 */
public class UserProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("服务已经启动");
        System.in.read();
    }
}
