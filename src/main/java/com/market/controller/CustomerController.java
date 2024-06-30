package com.market.controller;

import com.market.model.Customer;
import com.market.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value="auth",produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer auth(@RequestParam("user") String user,@RequestParam("password") String password)  {
        return customerService.authCustomer(user, password);

    }

    @PostMapping(value = "register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> register(@RequestBody Customer customer) {
        if(customerService.registerCustomer(customer)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

}
