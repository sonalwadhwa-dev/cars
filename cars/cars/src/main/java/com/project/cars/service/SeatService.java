package com.project.cars.service;

import com.project.cars.entity.Seats;
import com.project.cars.repository.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class SeatService
{
    @Autowired
    SeatRepo sr;
    public void addSeat(Seats s)
    {
        sr.save(s);
    }

    public List<Seats> getSeats()
    {
        return sr.findAll();
    }

    @Transactional
     public Seats lockSeat(long id)
     {
        Seats s1=sr.findById(id).get();
         s1.setBooked(true);
         Seats updatedSeat = sr.save(s1);
         return updatedSeat;
     }
}
