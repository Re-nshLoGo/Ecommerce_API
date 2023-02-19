package com.example.ecommerce.dao;

import com.example.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddRepo extends JpaRepository<Address,Integer> {
}
