package com.junglone.service.impl;

import com.junglone.common.util.MD5Util;
import com.junglone.dao.UserDAO;
import com.junglone.domain.User;
import com.junglone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:58.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void addUser(User user) {
        user.setId(System.nanoTime());
        user.setPassword(MD5Util.md5(user.getPassword()));
        user.setCreateTime(new Date());
        userDAO.addUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public List<User> selectUserList(Map<String, Object> mapCondition) {
        return userDAO.selectUserList(mapCondition);
    }

    @Override
    public User selectUserById(long lId) {
        return userDAO.selectUserById(lId);
    }

    @Override
    public User selectUser(String strUserName, String strPassword) {
        return userDAO.selectUser(strUserName, strPassword);
    }
}
