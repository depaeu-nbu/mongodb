package com.junglone.controller;

import com.junglone.common.log.LogDefault;
import com.junglone.common.util.StringUtil;
import com.junglone.domain.User;
import com.junglone.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 * Created by JungLone on 2016/8/31 11:58.
 */
@Controller
public class UserController extends BaseController {

    private static final Logger LOGGER = LogDefault.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public void login(HttpServletResponse response, String strUserName, String strPassword) {
        if (StringUtil.isBlank(strUserName) || StringUtil.isBlank(strPassword)) {
            printWriter(response, "{isSuccess:false,msg:\"用户名或密码为空!\"}");
            return;
        }
        User user = userService.selectUser(strUserName, strPassword);
        if (null == user) {
            printWriter(response, "{isSuccess:false,msg:\"用户名或密码错误!\"}");
            return;
        }
        printWriter(response, "{isSuccess:false,msg:\"登录成功!\"}");
    }
}
