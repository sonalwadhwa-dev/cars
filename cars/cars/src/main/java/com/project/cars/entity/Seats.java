package com.project.cars.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Seats
{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String seatNumber;
    boolean booked;
    @Version
    long version;
}
