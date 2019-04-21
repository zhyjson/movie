package cn.wdu4.movie.service;

import cn.wdu4.movie.pojo.User;

/**
 * user的service接口
 * @author zhy
 */
public interface UserService {
    /**
     * 通过用户id获取用户
     * @param userId
     * @return 用户
     */
    User getUser(Integer userId);

    /**
     * 插入一个用户
     * @param user
     * @return 插入结果
     */
    User saveUser(User user);

    /**
     * 删除一个用户
     * @param userId
     * @return 删除结果
     */
    boolean removeUser(Integer userId);

    /**
     * 通过用户的注解修改一个用户
     * @param user
     * @return 修改结果
     */
    User updateUser(User user);
}
