package com.spring.springannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Spring container will automatically create a spring bean for this class
//@Scope(value = "prototype") //Instead of passing a hard coded value, we can use a CONSTANT like below
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    //Whenever the spring IOC container create the spring bean for this class then this constructor
    // will get called.
    public PrototypeBean() {
        System.out.println("PrototypeBean..");
    }
}
