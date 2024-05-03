package com.example.demo.controllers;

import com.example.demo.DemoApplication;
import com.example.demo.security.WebSecurityConfig;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        DemoApplication.class,
        WebSecurityConfig.class,
})
public abstract class ControllerTest {
    // BeforeEach ... SpyBean
}
