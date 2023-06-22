package com.spring.springannotations;

import com.spring.springannotations.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {
        var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
        PizzaController pizzaController =  context.getBean(PizzaController.class);
//        PizzaController pizzaController =  context.getBean("pizzaController");
//        PizzaController pizzaController =  context.getBean("pizzaDemo");
        System.out.println(pizzaController.getPizza());//You can see that we have successfully
        // retrieved the PizzaController spring bean. That was done using the getBean()
        //Now when we run the application we can see that Hot Pizza is printed in the console.
        //Which means the class we have annotated as @Component is working as expected.
    }

}
