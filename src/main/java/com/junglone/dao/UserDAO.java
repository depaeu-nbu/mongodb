package com.junglone.dao;

import com.junglone.domain.User;
import com.junglone.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:56.
 */
public interface UserDAO {


    void addUser(User user);

    void deleteUser(User user);

    void updateUser(User user);

    List<UserService> selectUserList(Map<String, Object> mapCondition);

}
