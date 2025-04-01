package com.docker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.Customer;
import com.docker.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> allCustomers(){
		List<Customer> allCustomers = service.getAllCustomers();
		return new ResponseEntity<List<Customer>>(allCustomers,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Customer> specificCustomer(@PathVariable Integer id){
		Customer specificCustomer = service.getSpecificCustomer(id);
		return new ResponseEntity<Customer>(specificCustomer,HttpStatus.FOUND);
	}
}
