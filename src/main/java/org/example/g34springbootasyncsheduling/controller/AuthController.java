package org.example.g34springbootasyncsheduling.controller;

import org.example.g34springbootasyncsheduling.dto.UserCreationDTO;
import org.example.g34springbootasyncsheduling.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserCreationDTO user){
        authService.register(user);
        return ResponseEntity.ok("Sent email successfully , please check your email address and verification code");
    }
}
