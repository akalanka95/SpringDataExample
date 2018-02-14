package com.akalanka.springboot.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.akalanka.springboot.datajpa.repository")
@SpringBootApplication
@EnableJpaAuditing
public class SpringDataRestExample {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestExample.class, args);
	}
}
