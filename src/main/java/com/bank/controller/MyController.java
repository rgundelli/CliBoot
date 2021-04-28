package com.bank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MyController {

    @RequestMapping(value = "/greetings")
    public String getGreetings(HttpServletRequest request){
        Object attrib = request.getAttribute("attrib");
        request.setAttribute("attrib", attrib.toString() + "Controller");
        return request.getAttribute("attrib").toString();
    }

}
