package com.project.cars.repository;

import ch.qos.logback.core.model.ComponentModel;
import com.project.cars.Dtos.CarDto;
import com.project.cars.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper
{
    @Mapping(source="name",target="name")
    @Mapping(target="year",ignore = true)
    CarDto carToCarDto(Car car);
    List<CarDto> toDto(List<Car>c);
}
