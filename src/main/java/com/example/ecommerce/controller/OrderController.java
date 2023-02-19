package com.example.ecommerce.controller;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("place-order")
    public String place(@RequestBody Order order){
        orderService.save(order);
        return "order placed";
    }
    @GetMapping("get-order-by-id/{id}")
    public Order get(@PathVariable Integer id){
        return orderService.getbyid(id);
    }
}
