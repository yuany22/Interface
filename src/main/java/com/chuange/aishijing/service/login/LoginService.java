package com.chuange.aishijing.service.login;

import com.chuange.aishijing.pojo.userManage.User;

/**
 * Created by Administrator on 2019-02-21.
 */
public interface LoginService {
    //根据用户名查询信息
     public User selectUserByUsername(String username);
    //注册
     public void insertUser(User user);
    //修改密码
     public int updatePassword(String username,String password);

}
