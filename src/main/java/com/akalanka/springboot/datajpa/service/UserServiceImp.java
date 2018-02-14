package com.akalanka.springboot.datajpa.service;

import com.akalanka.springboot.datajpa.model.User;
import com.akalanka.springboot.datajpa.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public User saveUser(User user) {
       return userJpaRepository.save(user);
    }

    @Override
    public User getSingleUser(Integer id) {
         return userJpaRepository.findOne(id);
    }

    @Override
    public List<User> getAllUsers() {
         return userJpaRepository.findAll();
    }

    @Override
    public void deleteUser(User user) {
         userJpaRepository.delete(user);
    }
}
