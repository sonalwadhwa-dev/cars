package com.project.cars.controller;

import com.project.cars.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Value("${bank.defaultName}")
    String bankname;
    @Autowired
    private BankService bs;

    @GetMapping("/bankName")
    public String bankName() {
        return bankname;
    }

}
