package com.spring.springannotations.controller;

import com.spring.springannotations.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    //We can create handler methods that will handle the incoming HTTP requests

    //To make a method as a Handler method, lets annotate this method with @RequestMapping
    @RequestMapping("/hello-world") //We pass a URL
    //We also need to add one more annotation. That is the @ResponseBody
    //Whenever you want to develop REST API using spring MVC, then you have to annotate the
    // handler method with @ResponseBody, so that the handler method will return the JSON
    // as a response to the client.
    //@ResponseBody in general uses Spring MVC provided HTTP message converters to convert
    // the response into JSON format and then it will return that JSON  into client
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }

    //Lets create one more REST API that return the book object in a JSON format
    //Lets create a new package called beans
    //Check that package (Book class created)

    //Now lets create a REST API that return a book instance in a JSON format


    @RequestMapping("/book")
    //Inorder to return the below java object as a JSON to the client we have to use the @ResponseBody
    @ResponseBody //try running without this, u will get the whitelabel error.
    public Book getBook(){
        Book book = new Book(1,"Core Java","Learn Core Java and Latest features");
        return book;
    }


}

//NOTES :

/*

Whenever you want to develop REST API's using spring MVC then u have to use the @Controller
, @RequestMapping and @ResponseBody annotations


SUMMARY :

Whenever you annotate a class with @Controller annotation then this class becomes a spring
MVC  controller and it capable to handle the HTTP request.

@Controller is a specialization of @Component.

That means whenever you annotate a class with @Controller , then spring IOC container will
automatically scan that class and it will automatically create a spring bean for that class.

Within a @Controller class we create Handler methods and we make the handler methods REST API,
by using @RequestMapping and @ResponseBody

@RequestMapping is used to map the incoming HTTP request to that particular method annotated
with @RequestMapping

@ResponseBody is used to convert the return type of that method (method annotated with @RequestMapping)
into the JSON format. And then the JSON into HTTP response object and then it will
return that HTTP response object back to the client.
)

 */