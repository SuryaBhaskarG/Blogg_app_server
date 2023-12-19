package com.project.surya.blog.controller;

import com.project.surya.blog.dto.LoginRequest;
import com.project.surya.blog.dto.RegisterRequest;
import com.project.surya.blog.service.AuthService;
import com.project.surya.blog.service.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController
{

    @Autowired
    private AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity<RegisterRequest> signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest)
    {
        return authService.login(loginRequest);
    }
}
