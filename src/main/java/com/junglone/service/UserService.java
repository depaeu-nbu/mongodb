package com.junglone.service;

import com.junglone.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:49.
 */
public interface UserService {

    void addUser(User user);

    void deleteUser(User user);

    void updateUser(User user);

    List<UserService> selectUserList(Map<String, Object> mapCondition);

}
