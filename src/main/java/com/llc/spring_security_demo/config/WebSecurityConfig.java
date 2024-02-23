package com.llc.spring_security_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .anyRequest().authenticated()
        );

        http.formLogin(form -> form
                .successHandler(new CustomAuthenticationSuccessHandler()));

        //http.exceptionHandling(e -> e.authenticationEntryPoint(new CustomAuthenticationEntryPoint()));

        http.csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }

}
