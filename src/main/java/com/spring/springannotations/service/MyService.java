package com.spring.springannotations.service;

import org.springframework.stereotype.Service;

@Service //This automatically creates a spring bean for the MyService class
public class MyService {

    public String hello(){
        return "Hello Service";
    }
}
