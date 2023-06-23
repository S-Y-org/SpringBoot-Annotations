package com.spring.springannotations.config;


import com.spring.springannotations.controller.PizzaController;
import com.spring.springannotations.service.NonVegPizza;
import com.spring.springannotations.service.Pizza;
import com.spring.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

//In order to make this class as a config. class we have to annoate the class using @Configuration
//Whenever we configure a class with @Configuration annotation , then this class becomes
// a config class and within this config class, we can define a Spring Bean definition
// using @Bean annotation.
@Configuration
//@Lazy  //We can add @Lazy with @Configuration as well. (Just like with @Component)
//What happens is that all the spring beans that have been configured in this class will
// be lazily loaded
public class AppConfig {

    //Lets create a method to return an object of VegPizza class
    //After doing that we need to tell the spring IOC container to manage this VegPizza object
    //To do that annotate the method with @Bean

    //@Bean //This tells the spring IOC container to manage the object of this wedge pizza class
    //By default spring container will give a name to the spring bean as the method name (vegPizza)
    //We can explicitly give a name like this @Bean(name = "vegPizzaBean")
    //Then We can retrieve the spring bean using the bean name
    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza(){
        return new VegPizza(); //return an object of VegPizza
    }

    //Next lets see how to retrieve this VegPizza object from the spring IOC container.
    //Go to the main method
    /*==============================================================================*/

    //Now lets see how to inject the dependencies
    //Lets create one more spring bean
    @Bean
    //@Lazy  //We can add @Lazy with @Bean as well.
    //This spring bean will be then loaded lazily/on-demand
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

//    @Bean
//    public PizzaController pizzaController(){
//        return new PizzaController(vegPizza());//Pizza controller depends on a Pizza. Either veg or nonVeg
//        //lets say we want to inject vegPizza as a dependency here.
//        //vegPizza() is the above created method. It returns an object of the vegPizza class.
//    }

    /*=============================================================================*/

    //Lets try the initMethod and destroyMethod
    @Bean(initMethod = "init", destroyMethod = "destroy")
    //We can pass the value as a method name.(for both initMethod and destroyMethod)

    //This method(init) will get called before creating or initializing the class object.

    //Spring container will call the destroy method before it gets shut down.

    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());//Pizza controller depends on a Pizza. Either veg or nonVeg
        //lets say we want to inject vegPizza as a dependency here.
        //vegPizza() is the above created method. It returns an object of the vegPizza class.
    }

}
