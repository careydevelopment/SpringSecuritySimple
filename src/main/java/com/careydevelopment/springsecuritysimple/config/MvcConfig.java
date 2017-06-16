package com.careydevelopment.springsecuritysimple.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/simpleloginhome").setViewName("simpleloginhome");
        registry.addViewController("/").setViewName("simpleloginhome");
        registry.addViewController("/simpleloginsuccess").setViewName("simpleloginsuccess");
        registry.addViewController("/simplelogin").setViewName("simplelogin");
    }

}
