package com.spring.springannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
public class VegPizza implements Pizza {

    @Override
    public String getPizza(){
        return "Veg Pizza!";
    }
}

//NOTES Regarding changes done above:
/*
@Component automatically creates the Spring Bean

Now lets create a Spring Bean explicitly using @Bean

For that lets remove the @Component

Then lets see how we can use @Bean to create a spring bean for the VegPizza

Go to AppConfig.java
*/