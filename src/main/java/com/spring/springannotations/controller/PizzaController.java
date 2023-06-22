package com.spring.springannotations.controller;

import org.springframework.stereotype.Component;

@Component
public class PizzaController {


    public String getPizza(){
        return "Hot Pizza";
    }
}


//NOTES

/*
By default the spring container will give the spring bean name as the class name.
But the 1st letter of the class name will be lowercase
Here it will be "pizzaController"

We also explicilty give a name to the spring bean by passing value to the @Component
Ex : @Component("pizzaDemo").

pizzaDemo will be the spring bean name for the spring bean of the PizzaController

We can retrive the spring bean by using this name in the getBean() method.

Eariler we used the class type know, now we can use the name

Initally u will get an error, click the error and provide the casting. (error will be fixed)




* */