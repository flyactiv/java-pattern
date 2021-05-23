package com.example.lesson11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleRestController {

    @GetMapping
    public String someText(){
        return "Hello, world!";
    }
}
