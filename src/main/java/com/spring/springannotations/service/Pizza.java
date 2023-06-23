package com.spring.springannotations.service;

public interface Pizza {

    String getPizza();
}

//NOTES :

/*
(Q)when creating methods in an interface is it not neccessary to add the access modifier.
Ex: String getPizza();

In Java interfaces, it is not necessary to explicitly specify an access modifier for interface methods. By default, interface methods are implicitly public, which means they can be accessed from any other class.

So, in your example, the method `getPizza()` in the interface would be considered public:

public interface PizzaService {
    String getPizza();
}

Interfaces define a contract that classes implementing the interface must adhere to. Therefore, all methods declared in an interface are assumed to be public, and any class implementing the interface must provide an implementation for those methods with a compatible access modifier (public).

It's important to note that starting from Java 9, interfaces can also have private and private static methods, which are used for internal implementation details and cannot be accessed by implementing classes. However, the default behavior for interface methods remains as public.


 */