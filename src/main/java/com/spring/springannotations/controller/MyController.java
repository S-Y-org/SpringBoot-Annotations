package com.spring.springannotations.controller;

import org.springframework.stereotype.Controller;

@Controller //This automatically creates a spring bean for the MyController class
public class MyController {

    public String hello(){
        return "Hello Controller";
    }
}
