package com.sipingsoft.office.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
/**
 * spring mvc，控制器、拦截uri转发view,使用applicationContext.xml文件时是需要在web.xml中添加ContextLoaderListener
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.sipingsoft.office.web.controller", "com.sipingsoft.office.core.exception"})
public class WebConfig extends WebMvcConfigurerAdapter {

    /*
     * 配置JSP视图解析器
     */
    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setContentType("text/html; charset=UTF-8");
        // 如果使用jstl处理jsp格式化信息的话，InternalResourceViewResolver将试图处理为JstlView
        // JSTL格式化标签需要一个Locale对象，以便处理地域相关的值如日期和货币。这一句配置能确保JSTL标签获得Locale对象
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }
    /*
     * 配置静态资源处理，使DispacherServelet对静态资源的请求转发到Servlet容器中默认的servlet上而不是使用
     * DispacherServelet本身来处理静态资源
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}