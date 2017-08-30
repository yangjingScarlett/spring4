package cn.spring4.highLight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * @author Yangjing
 * @explain 这里是Spring MVC的配置
 * 在extends WebMvcConfigurerAdapter之后，它变成了一个自定义的WebMVC配置类
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("cn.spring4.highLight")
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    //这里的是基本的配置,不做定制化配置时也要写的。即即使不extends WebMvcConfigurerAdapter也要写
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        /**
         *可能读者对路径前缀配置为／WEB－INF/views／有些奇怪，怎么和我开发的目录不一
         * 致？因为看到的页面效果是运行时而不是开发时的代码，运行时代码会将我们的页面自动编译
         * 到／WEB-INF/views／下，因4-2 是运行时的目录结构，这样我们就能理解前缀为什么写
         * 成这样，在Spring Boot 中，我们将使用Thymeleaf 作为模板，因而不需要这样的配置。
         */
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    //重写方法以实现静态资源映射（直接访问静态资源），如：assets.js,css文件，图片等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //addResourceLocations指的是文件放置的位置，addResourceHandler指的是对外暴露的访问路径
        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    }

    //重写方法，使得路径参数中.后面的参数不可以忽略
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //将首页（http://localhost:8080)设置成index.jsp.它和HelloWorldController实现的功能是一样的
        registry.addViewController("/").setViewName("/index");
        registry.addViewController("/toUpload").setViewName("/upload");
        registry.addViewController("/converter").setViewName("/converter");
        registry.addViewController("/async").setViewName("/async");
    }

    @Bean
    public MyInterceptor interceptor() {
        return new MyInterceptor();
    }
    //重写方法，注册自定义的拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor());
    }

    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000);
        return multipartResolver;
    }

    @Bean
    public MyMessageConverter messageConverter(){
        return new MyMessageConverter();
    }
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> messageConverters){
        messageConverters.add(messageConverter());
    }

}
