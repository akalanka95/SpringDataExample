package com.akalanka.springboot.datajpa.service;

import com.akalanka.springboot.datajpa.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

     User saveUser(User user);
     User getSingleUser(Integer id);
     List<User> getAllUsers();
     void deleteUser(User user);

}
