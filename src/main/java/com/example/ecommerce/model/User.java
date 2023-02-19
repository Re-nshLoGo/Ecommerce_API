package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_tbl")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer user_id;
  private String name;
  private String email;
  private String pass;
  private String phonenum;

}
