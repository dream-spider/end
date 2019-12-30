package com.spider.end;

import com.spider.end.middleware.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan
public class AppConfig implements WebMvcConfigurer {

  @Autowired
  Handler handler;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(handler);
  }
}