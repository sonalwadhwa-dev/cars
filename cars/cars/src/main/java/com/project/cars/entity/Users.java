package com.project.cars.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String username;
    @Column(name="Email",nullable = false, unique = true)
    String email;
    String password;
}
