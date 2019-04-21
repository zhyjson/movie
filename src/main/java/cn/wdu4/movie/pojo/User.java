package cn.wdu4.movie.pojo;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Auther zhy
 * @Date 2019/4/19 0019 20:03
 * @Version 1.0
 **/
public class User implements Serializable {

    /**
     * 用户ID(PK)
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 联系电话
     */
    private String userPhone;

    /**
     * 用户密码
     */
    private String password;

    public User() {
    }

    public User(Integer userId, String userName, String userPhone, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}