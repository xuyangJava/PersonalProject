package com.sipingsoft.office.conf;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class DBConfig implements EnvironmentAware {

    private Environment env;
    
    public void setEnvironment(Environment environment) {
        this.env=environment;
    }
    
  //dataSource 配置 
    @Bean(initMethod="init",destroyMethod="close", name="druidDataSource")
    public DruidDataSource druidDataSource () {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(env.getProperty("jdbc.driver"));
        druidDataSource.setUrl(env.getProperty("jdbc.url"));
        druidDataSource.setUsername(env.getProperty("jdbc.username"));
        druidDataSource.setPassword(env.getProperty("jdbc.password"));
        druidDataSource.setInitialSize(Integer.parseInt(env.getProperty("ds.initialSize")));
        druidDataSource.setMinIdle(Integer.parseInt(env.getProperty("ds.minIdle")));
        druidDataSource.setMaxActive(Integer.parseInt(env.getProperty("ds.maxActive")));
        druidDataSource.setMaxWait(Integer.parseInt(env.getProperty("ds.maxWait")));
        druidDataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(env.getProperty("ds.timeBetweenEvictionRunsMillis")));
        druidDataSource.setMinEvictableIdleTimeMillis(Long.parseLong(env.getProperty("ds.minEvictableIdleTimeMillis")));
        druidDataSource.setValidationQuery("SELECT 1 ");
        /*
         * testOnBorrow和testOnReturn在生产环境一般是不开启的，主要是性能考虑。
         * 失效连接主要通过testWhileIdle保证，如果获取到了不可用的数据库连接，一般由应用处理异常。
         */
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(false);
        druidDataSource.setTestOnReturn(false);
        return druidDataSource;
    }
    
    /*
     * mybatis文件配置，扫描所有mapper文件
     */
    @Bean(name="sqlSessionFactory")
    @javax.annotation.Resource(name="druidDataSource")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] mapperLocations = resolver.getResources("classpath:com/sipingsoft/office/web/repository/*Mapper.xml");
        factoryBean.setMapperLocations(mapperLocations);
       // factoryBean.setConfigLocation(new ClassPathResource("classpath*:mybatis-config.xml"));
        return factoryBean.getObject();
    }
    /*
     * spring与mybatis整合配置，扫描所有dao
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.sipingsoft.office.web.repository");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
