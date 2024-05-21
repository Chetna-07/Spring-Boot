package com.example.springWebApp.todoList.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello there! Nice to meet you";
    }

}
