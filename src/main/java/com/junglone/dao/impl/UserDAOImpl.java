package com.junglone.dao.impl;

import com.junglone.dao.UserDAO;
import com.junglone.domain.User;
import com.junglone.service.UserService;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:58.
 */

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<UserService> selectUserList(Map<String, Object> mapCondition) {
        return null;
    }
}
