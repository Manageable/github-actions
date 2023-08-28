package com.github.actions.trial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("")
    public String getHello(){
        return "Hello";
    }
}
