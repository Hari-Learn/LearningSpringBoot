package com.nandi.learning.spring.backend_server.services;

import com.nandi.learning.spring.backend_server.domain.Users;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String sayHello(){
        return "Gotcha Spring boot";
    }

    public Users getUserById(int x){
        return new Users("Jack","Rose Daw");
    }
}
