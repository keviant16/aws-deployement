package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String Home(){
        return "Welcome to AWS Server";
    }

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World !";
    }
}
