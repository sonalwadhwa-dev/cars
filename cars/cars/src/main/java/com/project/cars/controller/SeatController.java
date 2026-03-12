package com.project.cars.controller;

import com.project.cars.entity.Seats;
import com.project.cars.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController
{
    @Autowired
    SeatService ss;
     @PostMapping("/addseat")
    public ResponseEntity<?> addSeat(@RequestBody Seats s)
     {
         ss.addSeat(s);
        return ResponseEntity.status(HttpStatus.OK).body(s);
     }

    @GetMapping("/getseat")
    public List<Seats> getSeat()
    {
        return ss.getSeats();
    }
    @GetMapping("/lockseat/{id}")
    public ResponseEntity<?> lockSeat(@PathVariable("id")long id)
    {
        ss.lockSeat(id);
        return ResponseEntity.ok("done");
    }

}
