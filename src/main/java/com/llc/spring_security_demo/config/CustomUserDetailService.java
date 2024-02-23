package com.llc.spring_security_demo.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.llc.spring_security_demo.entity.User;
import com.llc.spring_security_demo.mapper.UserMapper;
import com.llc.spring_security_demo.model.AuthUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class CustomUserDetailService implements UserDetailsPasswordService, UserDetailsManager {
    private final UserMapper userMapper;

    public CustomUserDetailService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("username", username));
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new AuthUser(user.getUsername(), user.getPassword(),
                true,
                true,
                true,
                true,
                new ArrayList<>());
    }

    @Override
    public void createUser(UserDetails userDetails) {
        User user = new User();
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        user.setExpireAt(new Date(new Date().getTime() + 1000L * 60 * 60 * 24 * 7));
        userMapper.insert(user);

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
    public UserDetails updatePassword(UserDetails user, String newPassword) {
        return null;
    }
}
