package com.project.cars.service;

import com.project.cars.entity.Banks;
import com.project.cars.repository.BanksRepo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankService {

    static List<Banks> li = new ArrayList<>();

    static {
        li.add(new Banks("Axis", 7.68));
    }

    BanksRepo br;

    BankService(BanksRepo br) {
        this.br = br;
    }


    public List<Banks> bankList() {
        return li;   // jo tumne static list banayi hai
    }

}
