package com.spring.springannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Spring container will automatically create a spring bean for this class
//@Scope(value = "singleton") //Instead of passing a hard coded value, we can use a CONSTANT like below
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//IMPORTANT : By Default spirng provides Singleton scope for each spring bean
//Therefore even if u dont explicitly specify the scope, By Default spirng provides Singleton scope for the spring bean
//u can comment line #9 and check.
public class SingletonBean {

    //Whenever the spring IOC container create the spring bean for this class then this constructor
    // will get called.
    public SingletonBean(){
        System.out.println("SingletonBean..");
    }
}
