package org.example.demo1.service;
import org.example.demo1.model.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}