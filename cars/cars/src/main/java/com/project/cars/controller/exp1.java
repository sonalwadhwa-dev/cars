package com.project.cars.controller;

import com.project.cars.entity.Exp1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exp1
{
    @Autowired
    @Qualifier("Exp1class2")
    Exp1 e;
    @GetMapping("/exp")
    public String execute()
    {
        return e.print();
    }
}
