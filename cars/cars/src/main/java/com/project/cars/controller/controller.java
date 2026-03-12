package com.project.cars.controller;

import com.project.cars.Dtos.CarDto;
import com.project.cars.entity.Car;
import com.project.cars.entity.Dogs;
import com.project.cars.entity.OwnerDetails;
import com.project.cars.exception.CarNotFoundException;
import com.project.cars.repository.CarMapper;
import com.project.cars.repository.carrepo;
import com.project.cars.service.DogService;
import com.project.cars.service.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Optional;



@RestController
@Slf4j
public class controller
{


    @Autowired
     service s;
    @Autowired
    carrepo c1;
    @Autowired
    DogService d1;

    //private static final Logger logger = LoggerFactory.getLogger(controller.class);
    private final RestTemplate restTemplate = new RestTemplate();
    @Autowired
    CarMapper mp;

    @PostMapping("/addcar")
    public ResponseEntity<?> add(@RequestBody Car c)
    {
        s.saveCar(c);
        return ResponseEntity.status(200).body("bnn gyi");
    }
    @PostMapping("/addowner")
    public ResponseEntity<?> addOwner(@RequestBody OwnerDetails od)
    {
        s.saveOwner(od);
        return ResponseEntity.status(201).body("owner done");
    }
    @GetMapping("/getall")

     public ResponseEntity<List<CarDto>>getCar()
    {
        List<CarDto>li=mp.toDto(s.getCars());

//        logger.info("fetchingitems");
//        logger.debug("fetched {} items,",li.size());
        if(li.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(li);
    }

    @GetMapping("/getbyid")

    public Car getbyid(@RequestParam("id") int id) throws  CarNotFoundException {
//         Optional<car> p= Optional.ofNullable(s.getbyid(id));
//         if(!p.isPresent())
//         {
//             throw new CarNotFoundException("not found");
//         }
//         return p.get();
        return s.getbyid(id);
    }
    @GetMapping("/getbynamandmod/{name}/{model}")
    public List<Car>modelnamelist(@PathVariable("name")String name ,@PathVariable("model")String model)
    {
       // log.info("fetching lists");
        return  s.namemodellist(name,model);

    }
    @PutMapping("/updatecar/{id}")
    public ResponseEntity<?> UpdateCar(@PathVariable("id") Long id,@RequestBody Car c) throws CarNotFoundException {
         s.updateCar(id,c);
         return ResponseEntity.status(HttpStatus.ACCEPTED).body("UPDATED");
    }
    @DeleteMapping("/deletecar/{id}")
    public ResponseEntity<?>deletecar(@PathVariable("id")Long id)
    {
        Optional<Car> c=c1.findById(id);
        c1.delete(c.get());
        return ResponseEntity.status(HttpStatus.OK).body("Car with id " + id + " has been deleted successfully.");
    }
    @GetMapping("/getbymodelandyear")
    public List<Car>modelnamelist(@RequestParam("model")String model ,@RequestParam("year")int year)
    {
        return  c1.findByModelAndYear(model,year);
    }
   // private final RestTemplate restTemplate = new RestTemplate();
    private final String DOG_API_URL = "https://dogapi.dog/api/v2/breeds";
    @GetMapping("/test")
   public List<Dogs.Links> getAllDogs()
    {
        return d1.getData();
    }

    @GetMapping("/users")
    public ResponseEntity<Map<String,Object>> getUsers() {

        Map<String,Object> users =
                restTemplate.getForObject(
                        "http://localhost:3000/template",
                        Map.class
                );

        return ResponseEntity.ok(users);
    }






}
