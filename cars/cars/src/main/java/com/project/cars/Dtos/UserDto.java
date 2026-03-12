package com.project.cars.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto
{
    @NotBlank(message="username cannot be null")
    String username;
    @Email
    @NotBlank(message="Email cannot be null")
    String email;
    @NotBlank(message="Email cannot be null")
    String password;
}
