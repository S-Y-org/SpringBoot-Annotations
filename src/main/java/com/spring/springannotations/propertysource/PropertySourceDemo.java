package com.spring.springannotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    //Lets see how we can use the environment class to read the property file
    //For that i will inject the environment class
    @Autowired //Field based dependency injection
    private Environment environment;

    //next comment all the @Value annotations below

    //After that go to the getter methods and do the modifications as below

    /*===========================================================================*/
    //@Value("${gmail.host}")
    private String host;

    //@Value("${gmail.email}")
    private String email;

    //@Value("${gmail.password}")
    private String password;

    //@Value("${app.name}")
    private String appName;

    //@Value("${app.description}")
    private String appDesc;

    public String getHost() {
//        return host;
        //What we need to do is, we need to get the value from the environment object
        return environment.getProperty("gmail.host"); //pass the key
    }

    public String getEmail() {
//        return email;
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
//        return password;
        return environment.getProperty("gmail.password");
    }

    public String getAppName() {
//        return appName;
        return environment.getProperty("app.name");

    }

    public String getAppDesc() {
//        return appDesc;
        return environment.getProperty("app.description");

    }
}
