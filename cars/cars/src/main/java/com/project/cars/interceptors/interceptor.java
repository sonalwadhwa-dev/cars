package com.project.cars.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class interceptor implements HandlerInterceptor
{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url=request.getRequestURL().toString();
        System.out.println("URL is "+url);
        System.out.println("content is "+ request.getContentType());
        System.out.println("IP address"+request.getRemoteAddr());
        System.out.println("method name "+request.getMethod());

        return true;
    }


}
