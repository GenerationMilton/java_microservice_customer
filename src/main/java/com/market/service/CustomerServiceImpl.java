package com.market.service;

import com.market.model.Customer;
import com.market.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{
    //capa negocio
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer authCustomer(String user, String password) {
        return customerRepository.findByUserAndPassword(user,password);
    }

    @Override
    public boolean registerCustomer(Customer customer) {
        if(customerRepository.findById(customer.getUser()).isPresent()){
            return false;
        }
        customerRepository.save(customer);
        return true;
    }
}
