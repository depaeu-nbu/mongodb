package com.junglone.service;

import com.junglone.common.util.MD5Util;
import com.junglone.domain.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by JungLone on 2016/8/30 15:11.
 */
public class UserServiceTest extends BaseTest {

    private UserService userService = (UserService) ac.getBean("userService");


    public void addUser() throws Exception {
        User user = new User();
        user.setUserName("hello");
        user.setPassword("hello");
        user.setName("Junglone");
        user.setSex(1);
        user.setMobile("13164256506");

        print(user);
        userService.addUser(user);
        print("done");
    }


    public void deleteUser() throws Exception {
        User user = new User();
        user.setId(569258800320852L);
        userService.deleteUser(user);
    }


    public void updateUser() throws Exception {
        User user = new User();
        user.setId(569739143668294L);
        user.setName("Hello");
        user.setMobile("abcdefg");
        userService.updateUser(user);
    }


    public void selectUserList() throws Exception {
        Map<String, Object> mapCondition = new HashMap<>();
        mapCondition.put("strCollectionName", "User");
        mapCondition.put("name", "Junglone");
        List<User> list = userService.selectUserList(mapCondition);

        print(list);

        list.forEach(this::print);
    }


    public void selectUserById() {
        long lId = 571991755907992L;
        User user = userService.selectUserById(lId);
        print(user);
    }

    @Test
    public void selectUser() {
        String strUserName = "hello";
        String strPassword = MD5Util.md5("hello");
        User user = userService.selectUser(strUserName, strPassword);
        print(user);
    }

}