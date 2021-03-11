package com.xywei.springcloud.config.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author future
 * @DateTime 2021/3/11 12:44
 * @Description
 */
@Component
public class AccessFromGatewayInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String securityKey = request.getHeader("securitykey");

        if (securityKey == null || !"my-gateway".equals(securityKey)) {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("禁止直接访问");
            return false;
        }

        return true;
    }
}
