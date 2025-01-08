package com.ecommerce.customer.controller;

import com.ecommerce.customer.entity.CustomerProfile;
import com.ecommerce.customer.repository.CustomerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profiles")
public class CustomerProfileController {

    @Autowired
    private CustomerProfileRepository customerProfileRepository;

    @PostMapping("/create")
    public CustomerProfile createProfile(@RequestBody CustomerProfile profile) {
        return customerProfileRepository.save(profile);
    }
}
