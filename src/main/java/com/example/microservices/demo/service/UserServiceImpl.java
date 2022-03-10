package com.example.microservices.demo.service;

import com.example.microservices.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

   public static List<User> users = new ArrayList<>();

    static {
        User user1 = new User(1,"user1",new Date());
        User user2 = new User(2,"user2",new Date());
        User user3 = new User(3,"user3",new Date());
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public List<User> getUserById(Integer id) {
        return users.stream().filter(user -> user.getId().equals(id)).collect(Collectors.toList());
    }

    @Override
    public List<User> saveUser(User user) {
        if(user.getId() == null){
            user.setId(users.size()+1);
        }
        users.add(user);
        return users;
    }
}
