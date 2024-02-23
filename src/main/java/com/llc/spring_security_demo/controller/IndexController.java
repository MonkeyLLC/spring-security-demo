package com.llc.spring_security_demo.controller;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class IndexController {
    @GetMapping()
    public String index(HttpServletRequest request) {

        System.out.println("Hello, Spring Security!");

        System.out.println(request.getPathInfo());

        return "Hello, Spring Security!";
    }


}
