package com.inventory.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Replace with your frontend URL
public class TestController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "Hello from backend!";
    }
}