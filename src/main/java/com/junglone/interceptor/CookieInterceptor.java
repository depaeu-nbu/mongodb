package com.junglone.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.junglone.common.util.CookieUtils;
import com.junglone.common.util.StringUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 主要判断Cookie 中记录是否存在，如果不存在则跳入到登录页
 */
public class CookieInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {
    }

    /**
     * 在业务处理请求之前调用拦截器
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
    }

    /**
     * 在访问 controller 之前，先验证cookie 是否登录超时.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        String redirectURL = "/login";//登录地址
        String userId = CookieUtils.getCookie(request, CookieUtils.COOKIE_HISTORYID);//用户名
        System.out.println("Invoke CookieInterceptor.preHandle userId ==== " + userId);
        if (request.getRequestURL().toString().contains("login")) {
            return true;
        }

        if (StringUtil.isBlank(userId)) {
            response.sendRedirect(request.getContextPath() + redirectURL);//重定向至登录页面
            return false;
        }
        return true;
    }

}
