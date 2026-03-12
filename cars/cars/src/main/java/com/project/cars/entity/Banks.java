package com.project.cars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Banks
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    double ROI;


    public Banks(String name, double ROI) {
        this.name=name;
        this.ROI=ROI;
    }

    public static class ApiResponse<B> {
        private Banks response;

        public ApiResponse(Banks response) {
            this.response = response;
        }

        public Banks getResponse() {
            return response;
        }

        public void setResponse(Banks response) {
            this.response = response;
        }
    }
}
