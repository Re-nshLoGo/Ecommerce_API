package com.example.ecommerce.service;

import com.example.ecommerce.dao.UserRepo;
import com.example.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public void saveUser(User user) {
        userRepo.save(user);
    }

    public User getbyId(Integer id) {
        return userRepo.findById(id).get();
    }
}
