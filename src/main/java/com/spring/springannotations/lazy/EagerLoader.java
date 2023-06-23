package com.spring.springannotations.lazy;

import org.springframework.stereotype.Component;

@Component //To automatically create a spring bean for this class
public class EagerLoader {
    public EagerLoader() {
        System.out.println("Eager Loader..");
    }
}



//NOTES

/*
(Q)Are constructors always  pubilc?

In Java, constructors are not always public. Constructors can have different access modifiers, including public, protected, private, and package-private (default). The choice of access modifier for a constructor depends on the intended visibility and accessibility of the constructor.

- Public constructors can be accessed from anywhere, including other classes and packages.
- Protected constructors can be accessed within the same package and by subclasses (even if they are in a different package).
- Private constructors can only be accessed within the same class.
- Package-private constructors (no explicit access modifier) can be accessed within the same package.

The choice of access modifier for a constructor depends on the design and requirements of the class. It is common for constructors to be public to allow the instantiation of objects from other classes.


(Q) What instance do we need private constructors?

Private constructors are typically used in scenarios where you want to restrict the creation of instances of a class. Here are a few common use cases for private constructors:

1. Singleton pattern: In the singleton pattern, a class should have only one instance throughout the application. By making the constructor private, you prevent the class from being instantiated directly. Instead, a static method or variable within the class can be used to provide access to the single instance.

2. Utility classes: Utility classes often contain static methods that provide common functionality and don't require instances. By making the constructor private, you prevent accidental instantiation of the utility class.

3. Factory methods: In some cases, you may want to provide custom factory methods within a class to control the creation of instances. By making the constructor private, you force users of the class to utilize the provided factory methods for object creation.

4. Immutable classes: Immutable classes are those whose state cannot be modified after creation. In such classes, you can make the constructor private and provide static factory methods to create instances with the desired state. This ensures that the objects maintain their immutability.

In these scenarios, private constructors help enforce design patterns, encapsulation, and control over object creation, ensuring that instances are created and accessed in the desired way.


 */