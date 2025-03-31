package com.docker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.model.Customer;

@RestController
public class CustomerRestService {

	@GetMapping("/send")
	public Customer shareCustomerData(){
		Customer customer=new Customer(102, "Sibasis", "Nayagad", 7006258000l);
		return customer;
	}
}
