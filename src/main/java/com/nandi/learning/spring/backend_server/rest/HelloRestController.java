package com.nandi.learning.spring.backend_server.rest;

import com.nandi.learning.spring.backend_server.domain.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/users")
    public Users sayGoodbye(){
        return new Users("hari","123");
    }
}
