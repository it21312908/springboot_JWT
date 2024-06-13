package com.example.springJwt.dto;


import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}