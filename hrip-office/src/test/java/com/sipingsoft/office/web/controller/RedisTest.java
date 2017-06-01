package com.sipingsoft.office.web.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.util.Assert;

import com.sipingsoft.office.conf.DBConfig;
import com.sipingsoft.office.conf.MybatisConfig;
import com.sipingsoft.office.conf.RedisConfig;
import com.sipingsoft.office.conf.RootConfig;
import com.sipingsoft.office.web.dao.IUserDao;
import com.sipingsoft.office.web.entity.User;

@ContextConfiguration(classes = {RootConfig.class, DBConfig.class, MybatisConfig.class, RedisConfig.class})  
public class RedisTest extends AbstractJUnit4SpringContextTests  {

    @Autowired  
    private IUserDao userDao;  
    
    /** 
     * 新增 
     * <br>------------------------------<br> 
     */  
    @Test  
    public void testAddUser() {  
        User user = new User();  
        user.setUsername("yx");  
        user.setPassword("123456");
        boolean result = userDao.add(user);  
        Assert.isTrue(result);
    }  
    //@Test
    public void testGetUser(){
        User user = userDao.get("yx");
        System.out.println(user.toString());
    }
      
}
