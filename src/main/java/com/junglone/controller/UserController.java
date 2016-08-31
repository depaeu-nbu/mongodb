package com.junglone.controller;

import com.alibaba.fastjson.JSON;
import com.junglone.common.log.LogDefault;
import com.junglone.common.util.CookieUtils;
import com.junglone.common.util.StringUtil;
import com.junglone.domain.User;
import com.junglone.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Created by JungLone on 2016/8/31 11:58.
 */
@Controller
public class UserController extends BaseController {

    private static final Logger LOGGER = LogDefault.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "sub_login", method = RequestMethod.POST)
    public String login(HttpServletResponse response, @RequestParam("userName") String strUserName, @RequestParam("password") String strPassword) {
        String strLogin = "login";
        if (StringUtil.isBlank(strUserName) || StringUtil.isBlank(strPassword)) {
            return strLogin;
        }
        User user = userService.selectUser(strUserName, strPassword);
        if (null == user) {
            return strLogin;
        }
        CookieUtils.saveCookie(response, CookieUtils.COOKIE_HISTORYID, user.getId()+"");
        return "redirect:/list";
    }

    @RequestMapping(value = "sub_register")
    public String register(User user) {
        userService.addUser(user);
        return "redirect:/list";
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getUserList(Model model) {

        Map<String, Object> mapCondition = new HashMap<>();

        List<User> listUser = userService.selectUserList(mapCondition);
        model.addAttribute("list", listUser);

        System.out.println(JSON.toJSONString(listUser));
        System.out.println(JSON.toJSONString(model));

        return "list";
    }


    @RequestMapping(value = "editor")
    public String editor(long lId, Model model) {
        User user = userService.selectUserById(lId);
        model.addAttribute("user", user);
        return "editor";
    }

    @RequestMapping(value = "sub_editor")
    public String editor(User user) {
        userService.updateUser(user);
        return "redirect:/list";
    }

    @RequestMapping(value = "delete")
    public String delete(long lId) {
        User user = new User();
        user.setId(lId);
        userService.deleteUser(user);
        return "redirect:/list";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String getUser(long lId, Model model) {
        System.out.println(JSON.toJSONString(lId));
        if (0 >= lId) {
            return "";
        }
        User user = userService.selectUserById(lId);
        model.addAttribute("user", user);

        System.out.println(JSON.toJSONString(user));
        System.out.println(JSON.toJSONString(model));

        return "user";
    }
}
