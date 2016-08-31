package com.junglone.interceptor;

import com.junglone.common.log.LogDefault;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 * Created by JungLone on 2016/06/29 14:36.
 */
public class BaseInterceptor implements HandlerInterceptor {

    private static Logger log = LogDefault.getLogger(BaseInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        boolean bFlag = true;

        String strPreventURL = httpServletRequest.getRequestURL().toString(); // 当前访问地址

        log.info("Invoke preHandle RequestURL ==== " + strPreventURL);

        if (strPreventURL.contains(".jsp")) {
            bFlag = false;
        }

        return bFlag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
