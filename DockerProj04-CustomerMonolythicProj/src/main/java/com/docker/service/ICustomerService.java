package com.docker.service;

import java.util.List;

import com.docker.entity.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomers();
	
	public Customer getSpecificCustomer(Integer id);
}
