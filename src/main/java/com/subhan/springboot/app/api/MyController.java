package com.subhan.springboot.app.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyController {
    @GetMapping()
    public String hello() {
        System.out.println("-----SPRING BOOT,GITHUB AND JENKINS INTEGRATION APPLICATION----- ");
        return "-----SPRING BOOT,GITHUB AND JENKINS INTEGRATION APPLICATION----- ";
    }
}