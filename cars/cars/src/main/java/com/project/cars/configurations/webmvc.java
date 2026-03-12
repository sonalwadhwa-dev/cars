package com.project.cars.configurations;

import com.project.cars.interceptors.interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webmvc implements WebMvcConfigurer
{

    @Autowired
    public interceptor ip;
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(ip).addPathPatterns("/**");
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
