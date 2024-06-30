package com.market.service;

import com.market.model.Customer;

public interface CustomerService {

    //methods in interface
    Customer authCustomer(String user, String password);
    boolean registerCustomer(Customer customer);
}
