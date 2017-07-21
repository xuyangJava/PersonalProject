package com.sipingsoft.office.conf;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer会同时创建DispacherServelet和ContextLoaderListener
 * @date 2017年2月15日 下午5:37:08
 * @author yangxu
 */
@ImportResource("classpath*:web.xml")
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class, DBConfig.class, MybatisConfig.class, RedisConfig.class, ActiveMQConfig.class};
    }

    /*
     * 返回带有@Configuration注解的类将会用来定义DispacherServelet应用上下文中的bean,
     * 配置root上下文,如Jpa数据源等等的配置
     */
    @Override
    protected Class<?>[] getServletConfigClasses() { //指定配置类
        return new Class<?>[] {WebConfig.class};
    }
    //指定开始被servlet处理的url,配置从/开始
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // 将DispacherServelet映射到 ：/
    }
    /*
     * 这里不需要绑定映射路径，该方法返回的所有Filter都会映射到DispacherServelet上,可以使用@order配置启动顺序
     */
    @Override
    protected Filter[] getServletFilters() { // 注册Filter
        // 配置Spring字符编码过滤器 
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();  
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[]{ characterEncodingFilter };
    }
    /*
     * 重载改方法可以对DispacherServelet进行额外的配置,
     */
    @Override
    protected void customizeRegistration(Dynamic registration) {
        // 配置mulipart临时路径/tmp/spittr/uploads，文件大小不超过2M，整个请求不超过4M(@Config-配置文件)
        registration.setMultipartConfig(new MultipartConfigElement("C:\\Users\\xjkms\\Desktop\\office-File\\", 2*1024*1024, 4*1024*1024,0));
    }
}
