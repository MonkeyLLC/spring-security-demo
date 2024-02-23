package com.llc.spring_security_demo.config;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.llc.spring_security_demo.entity.User;
import com.llc.spring_security_demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

public class DBUserDetailManager {
   /* @Resource
    private UserMapper userMapper;


    @Override
    public UserDetails updatePassword(UserDetails user, String newPassword) {
        return null;
    }

    @Override
    public void createUser(UserDetails user) {

    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

    @Override
    public boolean userExists(String username) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User one = new LambdaQueryChainWrapper<>(userMapper).eq(User::getUsername, username).one();
        if (one == null) {
            throw new UsernameNotFoundException("未能找到用户" + username);
        }

        return one;
    }*/
}
