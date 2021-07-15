package com.chandra.SpringBootJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/greet")
    public String greetMessage(){
        return "Welcome to Spring Boot Jenkins Application";
    }
}
