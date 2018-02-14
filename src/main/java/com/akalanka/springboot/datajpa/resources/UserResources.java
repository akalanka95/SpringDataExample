package com.akalanka.springboot.datajpa.resources;

import com.akalanka.springboot.datajpa.model.User;
import com.akalanka.springboot.datajpa.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResources {

    UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        return  userRepository.findAll();
    }
}
