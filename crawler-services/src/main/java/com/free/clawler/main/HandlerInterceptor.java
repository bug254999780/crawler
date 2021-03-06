package com.free.clawler.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
public class HandlerInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==========preHandle=====" + System.currentTimeMillis());
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("==========postHandle=====" + System.currentTimeMillis());
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        // Cookie cookie = new Cookie("loseTime", endTime - startTime + "ms");
        // response.addCookie(cookie);
        // response.addHeader("loseTime", endTime - startTime + "ms");
        // response.setHeader("loseTime", endTime - startTime + "ms");
        // modelAndView.addObject("loseTime", endTime - startTime + "ms");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("==========afterCompletion=====" + System.currentTimeMillis());
    }

}
