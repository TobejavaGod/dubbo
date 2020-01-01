package com.sxu.controller;

import com.sxu.service.UserService;

/**
 * @author jyw
 * @date 2020/1/1-16:53
 */
public class OrderController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void sayHello(String name){
        System.out.println(userService.sayHello(name));
    }
}
