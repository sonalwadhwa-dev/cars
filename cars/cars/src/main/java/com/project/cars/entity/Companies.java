package com.project.cars.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Companies
{
    @Id
    int id;
    @JsonProperty("companyName")
    String name;
    @JsonProperty("Established")
    int established;
    @JsonProperty("origin")
    String origin;

}
