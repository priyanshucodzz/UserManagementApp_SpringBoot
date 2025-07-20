package com.UserManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{

    @Autowired
    private UserService UserService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return UserService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }
}