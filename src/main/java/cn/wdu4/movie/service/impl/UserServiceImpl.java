package cn.wdu4.movie.service.impl;

import cn.wdu4.movie.mapper.UserMapper;
import cn.wdu4.movie.pojo.User;
import cn.wdu4.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO userService的实现类
 * @Auther zhy
 * @Date 2019/4/20 0020 10:53
 * @Version 1.0
 **/
@CacheConfig(cacheNames = "user")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Cacheable
    public User getUser(Integer userId) {
        return userMapper.getUser(userId);
    }

    @Override
    @CachePut(key = "#result.userId", unless = "#result == null ")
    public User saveUser(User user) {
        if(userMapper.saveUser(user)) {
            return user;
        }
        return null;
    }

    @Override
    @CacheEvict(condition = "#result == true ")
    public boolean removeUser(Integer userId) {
        return userMapper.removeUser(userId);
    }

    @Override
    @CacheEvict(condition = "#result == null ")
    public User updateUser(User user) {
        if(userMapper.updateUser(user)) {
            return user;
        }
        return null;
    }
}
