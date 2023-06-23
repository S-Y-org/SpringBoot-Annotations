package com.spring.springannotations;

import com.spring.springannotations.controller.PizzaController;
import com.spring.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {
        var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
//        PizzaController pizzaController =  context.getBean(PizzaController.class);
        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//        PizzaController pizzaController =  context.getBean("pizzaDemo");
        System.out.println(pizzaController.getPizza());//You can see that we have successfully
         // retrieved the PizzaController spring bean. That was done using the getBean()
        //Now when we run the application we can see that Hot Pizza is printed in the console.
        //Which means the class we have annotated as @Component is working as expected.

//        VegPizza vegPizza = context.getBean(VegPizza.class); //now we got a VegPizza spring bean
        // from the spring IOC container
//        VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
//        VegPizza vegPizza = (VegPizza) context.getBean("vegPizza"); //default given name(method name)
//        System.out.println(vegPizza.getPizza()); //Can see the Veg Pizza! is printed nicely
        // , it means we have successfully created a spring bean using @Bean
    }

}


//var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
//The above is a  Application context object
//Its nothing but a spring IOC container we can use to retrieve the spring bean from
// the spring IOC container by using getBean() method