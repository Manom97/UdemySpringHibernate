package com.demo.dao;

import com.demo.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
    public Customer getCustomer(long id);
    public void deleteCustomer(long id);
    public List<Customer> searchCustomers(String searchValue);
}
