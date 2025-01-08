package com.ecommerce.user.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return "Login successful for : " + username;
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        return "User registered successfully.";
    }
}
