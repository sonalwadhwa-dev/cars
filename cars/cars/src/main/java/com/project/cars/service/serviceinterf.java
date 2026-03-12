package com.project.cars.service;

import com.project.cars.entity.Car;
import com.project.cars.entity.OwnerDetails;
import com.project.cars.exception.CarNotFoundException;

import java.util.List;

public interface serviceinterf
{
    public void saveCar(Car c);
    public List<Car> getCars();
    public Car getbyid(int id) throws CarNotFoundException;
    public List<Car>namemodellist(String name,String model);
    public Car updateCar(Long id,Car c) throws CarNotFoundException;
    public void deleteall();
    public void saveOwner(OwnerDetails od);
}
