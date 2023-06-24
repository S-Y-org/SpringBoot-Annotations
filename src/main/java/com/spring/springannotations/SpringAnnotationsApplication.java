package com.spring.springannotations;

import com.spring.springannotations.controller.MyController;
import com.spring.springannotations.controller.PizzaController;
import com.spring.springannotations.lazy.LazyLoader;
import com.spring.springannotations.propertysource.PropertySourceDemo;
import com.spring.springannotations.repository.MyRepository;
import com.spring.springannotations.scope.PrototypeBean;
import com.spring.springannotations.scope.SingletonBean;
import com.spring.springannotations.service.MyService;
import com.spring.springannotations.service.VegPizza;
import com.spring.springannotations.value.ValueAnnotationDemo;
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

        /*==================================================================================*/

//        MyController myController  = context.getBean(MyController.class);
//        System.out.println(myController.hello());
//
//        MyService myService = context.getBean(MyService.class);
//        System.out.println(myService.hello());
//
//        MyRepository myRepository = context.getBean(MyRepository.class);
//        System.out.println(myRepository.hello());
//
//        LazyLoader lazyLoader = context.getBean(LazyLoader.class);
        //The problem in the above line is, the application context does not contain the spring
        //bean for the LazyLoader class
        //So now what the spring IOC  container will do is , it will create the spring
        //bean for the LazyLoader class on-demand.

        /*==================================================================================*/

//        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//        System.out.println(singletonBean1.hashCode());
//
//        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//        System.out.println(singletonBean2.hashCode());
//
//        SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//        System.out.println(singletonBean3.hashCode());
//
//        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//        System.out.println(prototypeBean1.hashCode());
//
//        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//        System.out.println(prototypeBean2.hashCode());
//
//        PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//        System.out.println(prototypeBean3.hashCode());

        //When you run the application you can see that Singleton Bean is printed only once
        // and Prototype Bean is printed 3 times

        //To understand this better lets print the hashcode of them, so that we can understand the object uniqueness
        //hashcode() returns the unique code / value for the object.

        //When u run the application you can see that, same hashcode is printed 3 times
        //It means that application context created only a single object for the SingletonBean class
        //So whenever we retrieve the same object multiple times, the application context returns the same object.
        //Thats why the same hashcode is printed.
        //Therefore it doesnt matter how many times u request the object, application context return the same object.


        //For the prototype bean u can see that the hashcode is different for each and every object.
        //It means application context basically creates the new object/instance for each request.

        //IMPORTANT : By Default spirng provides Singleton scope for each spring bean

        /*==================================================================================*/


//        ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//        System.out.println(valueAnnotationDemo.getDefaultName()); //can see that the value we passed in @Value("") will be printed
//
//        System.out.println(valueAnnotationDemo.getHost());
//        System.out.println(valueAnnotationDemo.getEmail());
//        System.out.println(valueAnnotationDemo.getPassword());
//
//        System.out.println(valueAnnotationDemo.getJavaHome());
//        System.out.println(valueAnnotationDemo.getHomeDir());


        /*==================================================================================*/
        PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
        System.out.println(propertySourceDemo.getHost());
        System.out.println(propertySourceDemo.getEmail());
        System.out.println(propertySourceDemo.getPassword());

        System.out.println(propertySourceDemo.getAppName());
        System.out.println(propertySourceDemo.getAppDesc());


    }//End of main method

} //End of SpringAnnotationsApplication class



//NOTES:

//var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
//The above is a  Application context object
//Its nothing but a spring IOC container we can use to retrieve the spring bean from
// the spring IOC container by using getBean() method
//It contains all the beans

/*


(Q)what is hashcode()

`hashCode()` is a method defined in the `Object` class in Java. It is used to generate a unique integer value, known as a hash code, for an object. The hash code is used by certain data structures, such as hash tables, to efficiently store and retrieve objects.

The `hashCode()` method returns an integer value based on the object's internal state. It is designed in such a way that if two objects are equal according to the `equals()` method, their hash codes should also be equal. However, it is possible for two different objects to have the same hash code, known as a hash code collision. The goal of the `hashCode()` method is to distribute the hash codes evenly across the range of possible values to minimize collisions.

When using classes from the Java standard library or most third-party libraries, the `hashCode()` method is typically implemented for you. However, if you define your own classes, you may need to override the `hashCode()` method to ensure that it produces meaningful and consistent hash codes based on the class's fields.

The `hashCode()` method is often used in conjunction with the `equals()` method to provide consistent behavior for comparing objects and using them in hash-based data structures. It is good practice to override both methods whenever you override one of them to maintain the contract between equality and hash code.

==================================================================================

(Q)is using lower case for package names a convention

No, using lowercase for package names is not a convention in Java. The convention for package names in Java is to use lowercase letters and follow the reverse domain name notation. This means that package names should be in all lowercase letters and should be based on the organization's domain name in reverse order.

For example, if a company has the domain name "example.com", the convention for package names would be "com.example.packageName". Each segment of the package name should be in lowercase letters.

Using lowercase package names helps maintain consistency and readability in Java code. However, it's important to note that while lowercase package names are the convention, Java is case-sensitive, so using different cases for package names would result in different packages.

 */