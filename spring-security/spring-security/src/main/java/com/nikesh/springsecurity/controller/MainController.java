package com.nikesh.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/items")
    public String getItems(){
        return "Returned items";
    }

    @GetMapping("/items/average")
    public String getAverageOfItems(){
        return "Returned average of items";
    }
}
