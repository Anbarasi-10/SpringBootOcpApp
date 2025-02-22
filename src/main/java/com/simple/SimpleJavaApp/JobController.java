package com.simple.SimpleJavaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JobController {

    @GetMapping("/api")
    public String Show(){
     return " Hello World ";

    }

}
