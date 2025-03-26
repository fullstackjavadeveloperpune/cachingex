package com.fullstack.service;

import com.fullstack.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    Customer save(Customer customer);

    Optional<Customer> findById(int custId);

    List<Customer> findAll();

    Customer update(Customer customer);

    void deleteById(int custId);
}
