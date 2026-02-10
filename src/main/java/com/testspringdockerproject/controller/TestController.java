package com.testspringdockerproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testing")
    public String testing(){
        return "testing";
    }

}
