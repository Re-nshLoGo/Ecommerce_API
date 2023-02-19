package com.example.ecommerce.controller;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    @Autowired
    AddService addService;
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Address address){
        addService.save(address);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }
}
