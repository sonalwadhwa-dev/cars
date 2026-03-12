package com.project.cars.repository;

import com.project.cars.entity.OwnerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<OwnerDetails,Long>
{

}
