package com.project.cars.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Exp1class1")
@Primary
public class Exp1class1 implements  Exp1{
    @Override
    public String print()
    {
       return "primary bean";
    }
}
