package com.example.microservices.demo.controller;

import com.example.microservices.demo.domain.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/bean")
    public HelloWorld getBean(){
        return new HelloWorld("Bean testing");
    }
}
