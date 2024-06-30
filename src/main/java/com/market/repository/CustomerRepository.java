package com.market.repository;

import com.market.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    //new method
    Customer findByUserAndPassword(String user, String password);
}
