package com.spring.springannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary // This will give higher preference to this bean. (check the PizzaController)
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "Non-Veg Pizza!";
    }
}
