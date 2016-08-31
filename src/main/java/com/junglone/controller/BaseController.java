package com.junglone.controller;

import com.junglone.common.log.LogDefault;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:48.
 */
public class BaseController {

    protected Logger logger = LogDefault.getLogger(BaseController.class);
    /**
     * Description: 跳转转换
     *
     * @param strPath
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }

    protected void printWriter(HttpServletResponse response, Object content) {
        PrintWriter printWriter = null;
        try {
            // 设置文本类型、编码
            response.setContentType("text/html;charset=utf-8");
            response.setCharacterEncoding("utf-8");
            printWriter = response.getWriter();
            printWriter.print(content.toString());

        } catch (Exception e) {
            if (null == e.getMessage()) {
                e.printStackTrace();
            } else {
                logger.error("Invoke printWriter happened Exception ==== " + e.getMessage());
            }
        } finally {
            if (null != printWriter) {
                printWriter.close();
            }
        }
    }

}
