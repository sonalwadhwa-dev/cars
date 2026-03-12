package com.project.cars.exception;

public class CarNotFoundException extends Exception
{
    String message;
    public  CarNotFoundException(String message)
    {
        super(message);
    }
}
