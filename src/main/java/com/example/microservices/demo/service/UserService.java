package com.example.microservices.demo.service;

import com.example.microservices.demo.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    List<User> getUserById(Integer id);

    List<User> saveUser(User user);
}
