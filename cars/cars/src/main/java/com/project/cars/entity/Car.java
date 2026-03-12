package com.project.cars.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="car")
public class Car
{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "yearm")
    int year;
    @Column(name="name")
    String name;
    @Column(name="model")
    String model;


}
