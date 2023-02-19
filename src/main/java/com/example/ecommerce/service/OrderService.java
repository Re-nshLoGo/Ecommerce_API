package com.example.ecommerce.service;

import com.example.ecommerce.dao.OrderRepo;
import com.example.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public void save(Order order) {
        orderRepo.save(order);
    }

    public Order getbyid(Integer id) {
        return orderRepo.findById(id).get();
    }
}
