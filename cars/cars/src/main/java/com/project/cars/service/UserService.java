package com.project.cars.service;

import com.project.cars.Dtos.UserDto;
import com.project.cars.entity.Users;
import com.project.cars.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserService
{


     public final PasswordEncoder passwordEncoder;
       @Autowired
       UsersRepo ur;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public Users register(UserDto ud)
      {
           Users u=Users.builder().email(ud.getEmail()).password(passwordEncoder.encode(ud.getPassword())).username(ud.getUsername()).build();
           return ur.save(u);
      }
}
