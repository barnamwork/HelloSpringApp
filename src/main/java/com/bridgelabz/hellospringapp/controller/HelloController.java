package com.bridgelabz.hellospringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}