package com.spring.springannotations.propertysource;


//@PropertySource and @PropertySources annotation is used with @Configuration Classes

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties") //We need to provide the property file name. So
// this is how we use the @PropertySource to provide the custom propery file to the spring environment.
//We can read this property file using @Value or environment class. In order to do that lets
// create a new class called PropertySourceDemo
//@PropertySource("classpath:messages.properties")

//Now lets see how we can use the @PropertySources
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:messages.properties")
})

public class SpringConfig {
}
