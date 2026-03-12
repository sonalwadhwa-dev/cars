package com.project.cars.errors;

import lombok.Data;

@Data
public class Errorhandle
{
    int errorcode;
    String status;
    public Errorhandle(int errorcode, String status)
    {
        this.errorcode=errorcode;
        this.status=status;
    }
}
