package com.sipingsoft.office.web.repository;

import java.util.List;

import com.sipingsoft.office.core.orm.Page;
import com.sipingsoft.office.web.entity.User;

/**
 * 用户Dao接口
 * 
 **/
public interface UserMapper {

    User selectByPrimaryKey(Long id);
    
    List<User> selectByPage(Page<User> page);
    
    List<User> selectByUser(User user);

}