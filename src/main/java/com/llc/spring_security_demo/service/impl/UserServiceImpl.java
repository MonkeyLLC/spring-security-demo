package com.llc.spring_security_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.llc.spring_security_demo.config.CustomUserDetailService;
import com.llc.spring_security_demo.entity.User;
import com.llc.spring_security_demo.mapper.UserMapper;
import com.llc.spring_security_demo.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private final CustomUserDetailService customUserDetailService;

    public UserServiceImpl(CustomUserDetailService customUserDetailService) {
        this.customUserDetailService = customUserDetailService;
    }

    @Override
    public void addUser(User user) {
        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withDefaultPasswordEncoder()
                .username(user.getUsername())
                .password(user.getPassword())
                .build();

        customUserDetailService.createUser(userDetails);
    }
}
