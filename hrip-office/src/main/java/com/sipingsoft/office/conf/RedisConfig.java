package com.sipingsoft.office.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
@PropertySource("classpath:redis.properties")
public class RedisConfig {
    
    @Autowired
    private Environment env;
    
    @Bean
    public JedisPoolConfig jedisPoolConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(Integer.parseInt(env.getProperty("redis.maxIdle")));
        return config;
    }
    
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig poolConfig){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setPoolConfig(poolConfig);
        factory.setHostName(env.getProperty("redis.host"));
        factory.setPort(Integer.parseInt(env.getProperty("redis.port")));
        factory.setPassword(env.getProperty("redis.pass"));
        return factory;
    }
    
    @SuppressWarnings("rawtypes")
    @Bean
    public RedisTemplate stringRedisTemplate(JedisConnectionFactory connectionFactory){
        return new StringRedisTemplate(connectionFactory);
    }
}
