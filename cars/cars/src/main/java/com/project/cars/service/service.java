package com.project.cars.service;

import com.project.cars.entity.Car;
import com.project.cars.entity.OwnerDetails;
import com.project.cars.exception.CarNotFoundException;
import com.project.cars.repository.OwnerRepo;
import com.project.cars.repository.carrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class service implements serviceinterf
{
    @Autowired
   public carrepo c1;
    @Autowired
    public OwnerRepo od1;

    //List<Car> cc=new ArrayList<>();


    @Override
    public void saveCar(Car c)
    {
       c1.save(c);
    }

    @Override
    public List<Car> getCars() {
        return c1.findAll();
    }

    @Override
    @Cacheable(cacheNames = "Cars",key = "#id")
    public Car getbyid(int id) throws CarNotFoundException {
        Optional<Car> p=c1.findById((long)id);
        if(!p.isPresent())
        {
            throw new CarNotFoundException("not found");
        }

        return p.get();

    }


    @Override
    public List<Car> namemodellist(String name, String model) {
        return c1.findByNameAndModel(name,model);
    }

    @Override
    public Car updateCar(Long id, Car c) throws CarNotFoundException {
        Optional<Car> p=c1.findById((long)id);
        if(!p.isPresent())
        {
            throw new CarNotFoundException("not found");
        }
        p.get().setModel(c.getModel());
        p.get().setName(c.getName());
        return c1.save(p.get());
    }
    public List<Car>getCarByModelAndYear(String model,int year)
    {
        return c1.findByModelAndYear(model,year);
    }


    @Override
    @CacheEvict(beforeInvocation = true,allEntries = true)
    public void deleteall()
    {
        c1.deleteAll();
    }

    @Override
    public void saveOwner(OwnerDetails od)
    {
        od1.save(od);
    }


}
