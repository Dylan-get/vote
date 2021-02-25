package com.homework.vote.config;


import com.homework.vote.component.LoginHandlerInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/*").excludePathPatterns(
                "index.html","/","/uesr/login","/webjars/**","asserts/**","/pages/front/login/loginpage","/pages/front/login/login");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index2").setViewName("success");
        registry.addViewController("/main.html").setViewName("Dashboard");
    }



}
