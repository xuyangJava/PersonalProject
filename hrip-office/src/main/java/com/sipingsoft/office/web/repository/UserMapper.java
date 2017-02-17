package com.sipingsoft.office.web.repository;

import com.sipingsoft.office.web.entity.User;

/**
 * 用户Dao接口
 * 
 **/
public interface UserMapper {

    User selectByPrimaryKey(Long id);

}