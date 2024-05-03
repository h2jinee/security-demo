package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // TODO: chain에 추가하자! --> 인증 filter를...
        
        http.authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
                .anyRequest()
                .authenticated()
        );

        return http.build();
    }
}