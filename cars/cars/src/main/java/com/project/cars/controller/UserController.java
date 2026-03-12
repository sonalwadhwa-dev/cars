package com.project.cars.controller;

import com.project.cars.Dtos.UserDto;
import com.project.cars.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController
{
    UserService us;
    @Autowired
    UserController(UserService us)
    {
        this.us=us;
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto ud)
    {
        us.register(ud);
        return ResponseEntity.ok(ud);
    }
}
