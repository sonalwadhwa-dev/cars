package com.project.cars.errors;

import com.project.cars.controller.BankController;
import com.project.cars.controller.controller;
import com.project.cars.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = {controller.class, BankController.class})
public class GloballyException
{
    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<?> handlecarnotfound(CarNotFoundException e)
    {

        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
//    @ExceptionHandler(RuntimeException.class)
//    public String handleRuntimeException()
//    {
//        return "runtime handled";
//    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Errorhandle> handleArithmeticException()
    {
        Errorhandle e= new Errorhandle(HttpStatus.INTERNAL_SERVER_ERROR.value(), "DONE");
        return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);
    }
}
