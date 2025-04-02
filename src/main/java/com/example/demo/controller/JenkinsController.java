package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JenkinsController 
{
    @GetMapping("/demo")
    public String sayHello() {
        return "Hello, Spring Boot is running!";
    }
}
