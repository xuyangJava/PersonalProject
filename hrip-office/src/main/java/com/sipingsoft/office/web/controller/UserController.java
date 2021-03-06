package com.sipingsoft.office.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sipingsoft.office.core.orm.Page;
import com.sipingsoft.office.web.dao.UserMapper;
import com.sipingsoft.office.web.entity.User;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;
    
    @RequestMapping("/user/listByPage")
    @ResponseBody
    public List<User> getUserList(Page<User> page, int pageNo){
        User u = new User();
        u.setId(1l);
        User selectOne = userMapper.selectOne(u);
        return userMapper.selectByPage(page);
    }
}
