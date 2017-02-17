package com.sipingsoft.office.conf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Configuration
@ComponentScan(basePackages = {"com.sipingsoft.office"},
    excludeFilters={
    @Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
})
public class RootConfig {

    /*
     * 解析multipart请求的内容(解析器)。@Config-配置文件
     * StandardServletMultipartResolver只能用于servlet3.0以上，servlet3.0以下使用CommonsMultipartResolver
     */
    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        
        return new StandardServletMultipartResolver(); // 依赖于servlet3.0开始于spring3.1
    }
    /*
     * 使用该bean才能让spring正确解析出${} 中的值
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    /*
     * 解决@ResponseBody返回中文乱码
     */
    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        StringHttpMessageConverter stringMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        
        MappingJackson2HttpMessageConverter mjt = new MappingJackson2HttpMessageConverter();
        
        List<MediaType> mediaTypes = new ArrayList<MediaType>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        stringMessageConverter.setSupportedMediaTypes(mediaTypes);
        messageConverters.add(stringMessageConverter);
        messageConverters.add(mjt);
        adapter.setMessageConverters(messageConverters);
        return adapter;
    }
}
