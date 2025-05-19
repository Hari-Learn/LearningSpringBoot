package com.nandi.learning.spring.backend_server.rest;

import com.nandi.learning.spring.backend_server.domain.Users;
import com.nandi.learning.spring.backend_server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @Autowired
    private UserService userService;

    public HelloRestController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/hello")
    public String sayHello(){
        return userService.sayHello();

    }

    @GetMapping("/users")
    public Users sayGoodbye(){
        return userService.getUserById(0);
    }
}
