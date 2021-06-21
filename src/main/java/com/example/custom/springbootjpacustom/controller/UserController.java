package com.example.custom.springbootjpacustom.controller;

import com.example.custom.springbootjpacustom.model.User;
import com.example.custom.springbootjpacustom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository employeeRepository;


    @PostMapping("/user")
    public User createEmployee(@RequestBody User employee){
       return employeeRepository.save(employee);
    }


    @GetMapping("/user/details")
    public List<User> findByFirstName(){
        return employeeRepository.findByFirstName();
    }
}
