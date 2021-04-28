package com.bank;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Component
public class MyInterceptor implements HandlerInterceptor {

    Logger log = Logger.getLogger("com.bank.MyInterceptor");
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            log.info("*** preHandle");
            request.setAttribute("attrib", "request");
        return true;
    }

    @Override
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        log.info("&&& postHandle");
        request.setAttribute("attrib", request.getAttribute("attrib").toString() + "Response");
        log.info(request.getAttribute("attrib").toString());
    }

}
