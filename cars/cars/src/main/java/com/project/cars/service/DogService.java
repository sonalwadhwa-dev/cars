package com.project.cars.service;

import com.project.cars.entity.Dogs;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class DogService
{
    private final RestTemplate restTemplate = new RestTemplate();
    private final String DOG_API_URL = "https://dogapi.dog/api/v2/breeds";
    public List<Dogs.Links> getData()
    {
        Dogs response = restTemplate.getForObject(DOG_API_URL, Dogs.class);
        return response != null ? (List<Dogs.Links>) response.getLinks() : List.of(); // return empty list if null
    }
}
