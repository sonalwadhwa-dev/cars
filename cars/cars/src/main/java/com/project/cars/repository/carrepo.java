package com.project.cars.repository;

import com.project.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface carrepo extends JpaRepository<Car,Long>
{
      @Query(value = "Select * from car c where c.name=?1 and c.model=?2",nativeQuery = true)
      public List<Car>findByNameAndModel(String name, String model);
      public List<Car>findByNameEquals(String name);
      public List<Car>findByYearLessThanEqual(int year);
      public List<Car>findByModelAndYear(@Param("model") String model,@Param("year")int year);
}
