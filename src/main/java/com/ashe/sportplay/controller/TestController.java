package com.ashe.sportplay.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:8080")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
