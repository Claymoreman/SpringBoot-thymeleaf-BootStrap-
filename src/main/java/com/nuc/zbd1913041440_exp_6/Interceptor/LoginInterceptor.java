package com.nuc.zbd1913041440_exp_6.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 朱博达
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object session = (Object) request.getSession().getAttribute("loginUser");
//        System.out.println(session);
        if (session == null){
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }
        return true;
    }
}
