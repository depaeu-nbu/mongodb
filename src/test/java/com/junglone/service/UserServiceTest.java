package com.junglone.service;

import com.junglone.domain.User;
import org.junit.Test;

import java.util.Date;
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
        user.setId(1000000);
        user.setName("Junglone");
        user.setSex(1);
        user.setMobile("13164256506");
        user.setCreateTime(new Date());

        print(user);
        userService.addUser(user);
        print("done");
    }


    public void deleteUser() throws Exception {
        User user = new User();
        user.setName("Junglone");
        userService.deleteUser(user);
    }


    public void updateUser() throws Exception {
        User user = new User();
        user.setName("Hello");
        user.setId(100002);
        userService.updateUser(user);
    }

    @Test
    public void selectUserList() throws Exception {
        Map<String, Object> mapCondition = new HashMap<>();
        mapCondition.put("strCollectionName", "User");
        mapCondition.put("name", "Junglone");
        List<User> list = userService.selectUserList(mapCondition);

        print(list);

        list.forEach(this::print);
    }

}