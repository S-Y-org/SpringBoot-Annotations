package com.spring.springannotations;

import com.spring.springannotations.controller.MyController;
import com.spring.springannotations.controller.PizzaController;
import com.spring.springannotations.lazy.LazyLoader;
import com.spring.springannotations.repository.MyRepository;
import com.spring.springannotations.service.MyService;
import com.spring.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {
        var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
//        PizzaController pizzaController =  context.getBean(PizzaController.class);
//        PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//        PizzaController pizzaController =  context.getBean("pizzaDemo");
//        System.out.println(pizzaController.getPizza());//You can see that we have successfully
         // retrieved the PizzaController spring bean. That was done using the getBean()
        //Now when we run the application we can see that Hot Pizza is printed in the console.
        //Which means the class we have annotated as @Component is working as expected.

//        VegPizza vegPizza = context.getBean(VegPizza.class); //now we got a VegPizza spring bean
        // from the spring IOC container
//        VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
//        VegPizza vegPizza = (VegPizza) context.getBean("vegPizza"); //default given name(method name)
//        System.out.println(vegPizza.getPizza()); //Can see the Veg Pizza! is printed nicely
        // , it means we have successfully created a spring bean using @Bean


        MyController myController  = context.getBean(MyController.class);
        System.out.println(myController.hello());

        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.hello());

        MyRepository myRepository = context.getBean(MyRepository.class);
        System.out.println(myRepository.hello());

        LazyLoader lazyLoader = context.getBean(LazyLoader.class);
        //The problem in the above line is, the application context does not contain the spring
        //bean for the LazyLoader class
        //So now what the spring IOC  container will do is , it will create the spring
        //bean for the LazyLoader class on-demand.

    }

}


//var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
//The above is a  Application context object
//Its nothing but a spring IOC container we can use to retrieve the spring bean from
// the spring IOC container by using getBean() method