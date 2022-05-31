package com.hupean.impl;

import com.hupean.service.UserService;

/**
 * @author hupan
 * @description
 * @date 2022/5/16
 */
public class UserServiceImpl implements UserService {

    // 2.接口实现
    @Override
    public String getName(String name) {
        System.out.println("name in interface is : " + name);
        return name + " dubbo success!";
    }
}
