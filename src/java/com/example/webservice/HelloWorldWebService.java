package com.example.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Administrator
 */
@WebService
public class HelloWorldWebService {
    
    @WebMethod
    public String sayHello() {
        return "Hello, World!";
    }
}
