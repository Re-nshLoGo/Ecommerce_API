package com.example.ecommerce.service;

import com.example.ecommerce.dao.AddRepo;
import com.example.ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddService {
    @Autowired
    AddRepo addRepo;
    public void save(Address address) {
        addRepo.save(address);
    }
}
