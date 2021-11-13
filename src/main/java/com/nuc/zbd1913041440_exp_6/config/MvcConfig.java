package com.nuc.zbd1913041440_exp_6.config;

import com.nuc.zbd1913041440_exp_6.Interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 朱博达
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {


    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/image/**").addResourceLocations("file:E:/BookCover/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/","/reg","/css/**","/js/**","/img/**","/scss/**","/vendor/**","/login");
    }
}
