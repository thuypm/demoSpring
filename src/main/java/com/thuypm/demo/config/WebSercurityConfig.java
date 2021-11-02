package com.thuypm.demo.config;

import com.thuypm.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSercurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;
    @Bean
    public JWTFilter jwtAuthenticationFilter() {
        return new JWTFilter();
    }
}
