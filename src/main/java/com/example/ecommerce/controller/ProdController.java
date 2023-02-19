package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProdService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdController {
    @Autowired
    ProdService prodService;
    @PostMapping("create-product")
    public ResponseEntity<String> create(@RequestBody Product product){
        prodService.save(product);
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }
    @GetMapping("product")
    public List<Product> getall(@Nullable @RequestParam Integer id){
        return prodService.fetch(id);
    }
    @DeleteMapping("deletebyid/{id}")
    public void delete(@PathVariable Integer id){
        prodService.delete(id);
    }
}
