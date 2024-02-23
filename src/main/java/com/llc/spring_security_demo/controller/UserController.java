package com.llc.spring_security_demo.controller;

import com.llc.spring_security_demo.entity.User;
import com.llc.spring_security_demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public Boolean addUser(@RequestBody User user) {
        userService.addUser(user);
        return true;
    }
}
