package com.example.microservices.demo.controller;

import com.example.microservices.demo.domain.User;
import com.example.microservices.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{id}")
    public List<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/saveUser")
    public List<User> saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
