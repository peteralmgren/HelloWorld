package com.example.helloworld.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }

}
