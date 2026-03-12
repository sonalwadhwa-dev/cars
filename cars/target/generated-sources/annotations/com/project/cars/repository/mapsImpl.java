package com.project.cars.repository;

import com.project.cars.Dtos.CarDto;
import com.project.cars.entity.Car;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-07T19:45:47+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class mapsImpl implements maps {

    @Override
    public CarDto toDto(Car c) {
        if ( c == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setId( c.getId() );
        carDto.setYear( c.getYear() );
        carDto.setName( c.getName() );
        carDto.setModel( c.getModel() );

        return carDto;
    }

    @Override
    public Car toEntity(CarDto cd) {
        if ( cd == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( cd.getId() );
        car.setYear( cd.getYear() );
        car.setName( cd.getName() );
        car.setModel( cd.getModel() );

        return car;
    }

    @Override
    public List<CarDto> toList(List<Car> c) {
        if ( c == null ) {
            return null;
        }

        List<CarDto> list = new ArrayList<CarDto>( c.size() );
        for ( Car car : c ) {
            list.add( toDto( car ) );
        }

        return list;
    }
}
