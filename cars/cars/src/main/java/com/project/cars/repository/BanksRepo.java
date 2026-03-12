package com.project.cars.repository;

import com.project.cars.entity.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BanksRepo extends JpaRepository<Banks,Long>
{
    @Query(value="select * from banks where name=:name",nativeQuery = true)
    public List findByBankName(@Param("name") String name);
}
