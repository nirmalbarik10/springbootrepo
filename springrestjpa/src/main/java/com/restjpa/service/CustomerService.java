package com.restjpa.service;



import java.util.List;

import com.restjpa.entity.Customer;

public interface CustomerService {
    Customer createCustomer(Customer Customer);

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Customer Customer);

    void deleteCustomer(Long CustomerId);
}
