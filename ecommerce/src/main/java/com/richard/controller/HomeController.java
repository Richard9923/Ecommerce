package com.richard.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    public String HomeControllerHandler(){
        return "Welcome to Ecommerce Multivendor";
    }
}
