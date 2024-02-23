package com.llc.spring_security_demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llc.spring_security_demo.entity.User;

public interface UserService extends IService<User> {
    void addUser(User user);
}
