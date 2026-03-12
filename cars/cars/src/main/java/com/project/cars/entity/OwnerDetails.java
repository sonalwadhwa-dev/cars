package com.project.cars.entity;

import jakarta.persistence.*;

import java.util.HashMap;

@Entity
public class OwnerDetails
{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="owner_name")
    public String name;
    public HashMap<String,Object> address;


}
