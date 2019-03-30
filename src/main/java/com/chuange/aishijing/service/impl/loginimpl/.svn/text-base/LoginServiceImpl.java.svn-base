package com.chuange.aishijing.service.impl.loginimpl;

import com.chuange.aishijing.dao.usermanage.UserManageDao;
import com.chuange.aishijing.pojo.userManage.User;
import com.chuange.aishijing.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2019-02-21.
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserManageDao userManageDao;
    @Override
    public User selectUserByUsername(String username) {
        User user = userManageDao.findAllByTelphone(username);
        return user;
    }

    @Override
    public void insertUser(User user) {
        userManageDao.save(user);
    }

    @Override
    public int updatePassword(String username, String password) {
        int i = userManageDao.updatePasswordByTelphone1(password,username);
        return i;
    }
}
