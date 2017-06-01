package com.sipingsoft.office.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.sipingsoft.office.core.AbstractBaseRedisDao;
import com.sipingsoft.office.web.entity.User;

@Component
public class UserDao extends AbstractBaseRedisDao<String, User> implements IUserDao {
    
    @Override
    public boolean add(final User user) {
        return redisTemplate.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                byte[] key = serializer.serialize(user.getUsername());
                byte[] name = serializer.serialize(user.getPassword());
                return connection.setNX(key, name);
            }
        });
    }

    @Override
    public boolean add(final List<User> list) {
        Assert.notEmpty(list);
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                for (User user : list) {
                    byte[] key = serializer.serialize(user.getUsername());
                    byte[] name = serializer.serialize(user.getPassword());
                    connection.setNX(key, name);
                }
                return true;
            }
        }, false, true);
        return result;
    }

    @Override
    public void delete(String key) {
        List<String> list = new ArrayList<String>();
        list.add(key);
        delete(list);
    }

    @Override
    public void delete(List<String> keys) {
        redisTemplate.delete(keys);
    }

    @Override
    public boolean update(final User user) {
        String key = user.getUsername();
        if (get(key) == null) {
            throw new NullPointerException("数据行不存在, key = " + key);
        }
        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                byte[] key = serializer.serialize(user.getUsername());
                byte[] name = serializer.serialize(user.getPassword());
                connection.set(key, name);
                return true;
            }
        });
        return result;
    }

    @Override
    public User get(final String username) {
        User result = redisTemplate.execute(new RedisCallback<User>() {
            public User doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                byte[] key = serializer.serialize(username);
                byte[] value = connection.get(key);
                if (value == null) {
                    return null;
                }
                String password = serializer.deserialize(value);
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                return user;
            }
        });
        return result;
    }

}
