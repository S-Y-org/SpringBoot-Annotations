package com.spring.springannotations.controller;

import com.spring.springannotations.service.Pizza;
import com.spring.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    //Lets inject VegPizza dependency/spring bean. For that lets create an instance variable
    // of VegPizza Class
//    private VegPizza vegPizza;

    //Lets see how to use the @Autowired to inject the spring bean/dependency using Constructor injection
//    @Autowired //this annotation tells the spring container to automatically inject the VegPizza bean
//    // using the below constructor.
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    //Next Lets see how to use @Autowired with setter injection
//    @Autowired //this annotation tells the spring container to automatically inject the VegPizza bean
//   // using the below setter method.
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    //Next Lets see how to use @Autowired with field injection
    //@Autowired //this annotation tells the spring container to automatically inject the VegPizza bean
    // using the below field.
//    private VegPizza vegPizza;

    //To achieve loose coupling, we will inject the interface and pass the implementation dynamically.
    //Earlier we injected the class () , Now lets inject the interface
    private Pizza pizza;

   // @Autowired//this annotation tells the spring container to automatically inject the Pizza(interface) bean
    // using the below constructor.
    //U can see that this constructor takes the pizza interface as an argument.
    //Pizza interface has multiple implementations (VegPizza and NonVegPizza)
    //So Spring IOC container will get confuse on which pizza interface implementation they have to inject
    // , using the below constructor.
    //So in order to avoid this confusion/ambiguity we can add the @Qualifier

    //@Qualifier("bean name")
//    public PizzaController(Pizza pizza) {
//        this.pizza = pizza;
//    }

//    public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
//        this.pizza = pizza;
//    }

    //Since we have used the @Primary for the NonVegPizza bean we dont need to explicity
    // , write @Qualifier("nonVegPizza").
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza(){

//        return "Hot Pizza";
//        return vegPizza.getPizza();
        return pizza.getPizza();
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