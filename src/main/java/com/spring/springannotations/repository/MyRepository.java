package com.spring.springannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String hello(){
        return "My Repository";
    }
}
