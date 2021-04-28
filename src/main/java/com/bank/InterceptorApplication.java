package com.bank;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan({"com.bank"})
public class InterceptorApplication {

    @RequestMapping("/")
    String home() {
        return "<h1>Home</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(InterceptorApplication.class, args);
    }

}
