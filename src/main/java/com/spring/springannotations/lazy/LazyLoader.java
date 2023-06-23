package com.spring.springannotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //To automatically create a spring bean for this class
@Lazy //If we run the application, the spring container will not create the spring
// bean for this class eagerly. That happens becuz of the @Lazy
//@Lazy tells the spring container to load the spring bean for this class On-Demand.
public class LazyLoader {
    public LazyLoader() {
        System.out.println("Lazy Loader..");
    }
}
