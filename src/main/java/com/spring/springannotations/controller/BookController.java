package com.spring.springannotations.controller;

import com.spring.springannotations.beans.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody /*Another thing we can do is, u can see that we have added @ResponseBody at method level
// to each and every method repeatedly. To avoid this we can add the @ResponseBody at class level*/
//And also instead of using both the @Controller and @ResponseBody , we can use
// the @RestController. Its a combination of the two.
@RestController
//RequestMapping with Class
@RequestMapping("/api/v1") //This is the base URI
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
//    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }

    //Lets create one more REST API that return the book object in a JSON format
    //Lets create a new package called beans
    //Check that package (Book class created)

    //Now lets create a REST API that return a book instance in a JSON format


    //We havent specified any HTTP method for our @RequestMapping.
    //By default it we dont specify the HTTP method for the @RequestMapping, then
    // it will take the HTTP method as the GET method.

    //@RequestMapping has a method attribute. We can use that to specify the HTTP method
//    @RequestMapping(value = {"/book", "/core-java", "/java"},
//            method = RequestMethod.GET
//    )

    /*@RequestMapping with produces and consumer*/
    @RequestMapping(value = {"/book", "/core-java", "/java"},
            method = RequestMethod.GET,
            //produces = MediaType.APPLICATION_JSON_VALUE //produces attribute tells
            // the REST API to produce the result in a JSON format.
            //We can also specify muliple media types as below.
            //Lets say our REST API want to return the response in a JSON and XML format.
            //Then we can specify like below
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },

            //Lets say our REST API wants to consume the JSON that is sent by the client.
            //Then we can go ahead and use the consumes attribute
            //consumes = MediaType.APPLICATION_JSON_VALUE

            //Here also we can specify multiple media types
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }

    )

    /*@RequestMapping with Multiple URI*/
    //@RequestMapping(value = {"/book", "/core-java", "/java"}) //This is an example
    // for @RequestMapping with multiple URI

    //@RequestMapping("/book")

    //Inorder to return the below java object as a JSON to the client we have to use the @ResponseBody
//    @ResponseBody //try running without this, u will get the whitelabel error.
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

Another thing we can do is, u can see that we have added @ResponseBody at method level
to each and every method repeatedly.

To avoid this we can add the @ResponseBody at class level
=======================================================================


The main difference between `@Controller` and `@RestController` lies in the response returned by the annotated methods.

1. `@Controller`: It is used to mark a class as a controller component in the Spring MVC framework. The methods within a `@Controller` class are typically annotated with `@RequestMapping`, and these methods handle HTTP requests and return a logical view name or a `ModelAndView` object. The response is typically rendered using a view template (e.g., JSP, Thymeleaf) to generate the final HTML response.

2. `@RestController`: It is a specialized version of the `@Controller` annotation that combines the functionality of a controller and the `@ResponseBody` annotation. It is typically used in RESTful web services scenarios where the response is not rendered using a view template but rather directly serialized into the response body as JSON, XML, or other formats. The methods within a `@RestController` class return domain objects or collections directly, which are automatically converted to the desired format (e.g., JSON) by Spring's content negotiation mechanisms.

IMPORTANT :
In summary, `@Controller` is used for traditional web applications where the response is rendered using view templates, while `@RestController` is used for building RESTful APIs where the response is serialized directly into the response body.

 */