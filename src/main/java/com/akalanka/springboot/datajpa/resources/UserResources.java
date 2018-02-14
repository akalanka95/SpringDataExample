package com.akalanka.springboot.datajpa.resources;

import com.akalanka.springboot.datajpa.model.User;
import com.akalanka.springboot.datajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResources {

    @Autowired
    private UserService userService;

    //create a user
    @PostMapping(value = "/add")
    public User addUser(@Valid @RequestBody User user){
        //User user1 = new User();
        //user1.setName("Chaminda");
        //user1.setSalary(1200);
        //user1.setDescription("Working Hard");

        return userService.saveUser(user);

    }

    @GetMapping(value = "/id/{id}")
    public User getSingleUser(@PathVariable(value = "id") Integer id){
        return userService.getSingleUser(id);
    }

    @GetMapping(value = "/all")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable(value = "id") Integer id){

        User user = userService.getSingleUser(id);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteUser(user);
        return ResponseEntity.ok().build();
    }

}
