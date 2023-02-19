package com.example.ecommerce.service;

import com.example.ecommerce.dao.ProdRepo;
import com.example.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdService {
    @Autowired
    ProdRepo prodRepo;
    public void save(Product product) {
        prodRepo.save(product);
    }

    public List<Product> fetch(Integer id) {
        if(id != null){
            return (List<Product>) prodRepo.findById(id).get();
        }else{
            return prodRepo.findAll();
        }
    }

    public void delete(Integer id) {
        prodRepo.deleteById(id);
    }
}
