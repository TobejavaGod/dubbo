package com.sxu.service.impl;

import com.sxu.service.UserService;

/**
 * @author jyw
 * @date 2020/1/1-15:30
 */
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }
}
