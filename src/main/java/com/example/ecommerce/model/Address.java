package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address_tbl")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addId;
    private String name;
    private String landmark;
    private String zipcode;
    private String state;
    @JoinColumn(name = "user_id")
    @OneToOne
    private User user_id;
}
