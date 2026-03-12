package com.project.cars.repository;

import com.project.cars.entity.Seats;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepo extends JpaRepository<Seats,Long>
{
    List<Seats> findBySeatNumber(String number);
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT s FROM Seats s WHERE s.id = :id")
    Seats lockSeatById(long id);
}
