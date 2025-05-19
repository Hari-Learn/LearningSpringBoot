package com.nandi.learning.spring.backend_server.services;

import com.nandi.learning.spring.backend_server.domain.Users;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    public String sayHello(){
        return "Gotcha Spring boot : ============= " + LocalDateTime.now().toString();
    }

    public Users getUserById(int x){
        return new Users("Jack","Rose Daw");
    }
}
