package com.docker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.docker.entity.Customer;
import com.docker.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	@Cacheable(value = "customer")
	public List<Customer> getAllCustomers() {
		List<Customer> customers = repo.findAll();
		return customers;
	}

	@Override
	@Cacheable(value = "customer", key = "#id")
	public Customer getSpecificCustomer(Integer id) {
		Optional<Customer> byId = repo.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		} else {
			throw new RuntimeException("Id not found !");
		}
	}

}
