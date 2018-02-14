package com.akalanka.springboot.datajpa.repository;

import com.akalanka.springboot.datajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserJpaRepository extends JpaRepository<User,Integer> {

}
