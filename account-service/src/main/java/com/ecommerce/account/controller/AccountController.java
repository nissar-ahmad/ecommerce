package com.ecommerce.account.controller;

import com.ecommerce.account.entity.User;
import com.ecommerce.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public User createAccount(@RequestBody User user) {
        return userRepository.save(user);
    }
}
