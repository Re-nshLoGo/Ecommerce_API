package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_tbl")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User userId;
    @JoinColumn(name = "prodId")
    @OneToOne
    private Product productId;
    @JoinColumn(name = "addId")
    @OneToOne
    private Address addId;
    private Integer prodQuantity;
}
