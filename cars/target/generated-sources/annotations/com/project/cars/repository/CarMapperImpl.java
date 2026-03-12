package com.project.cars.repository;

import com.project.cars.Dtos.CarDto;
import com.project.cars.entity.Car;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-07T20:28:38+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto carToCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setName( car.getName() );
        carDto.setId( car.getId() );
        carDto.setModel( car.getModel() );

        return carDto;
    }

    @Override
    public List<CarDto> toDto(List<Car> c) {
        if ( c == null ) {
            return null;
        }

        List<CarDto> list = new ArrayList<CarDto>( c.size() );
        for ( Car car : c ) {
            list.add( carToCarDto( car ) );
        }

        return list;
    }
}
