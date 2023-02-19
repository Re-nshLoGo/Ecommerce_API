package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/create-user")
    public ResponseEntity<String> add(@RequestBody User user){
        userService.saveUser(user);
        return new ResponseEntity<>("saved", HttpStatus.CREATED);
    }
    @GetMapping("get-by-id/{userid}")
    public User getUser(@PathVariable Integer id){
       return userService.getbyId(id);
    }


}
