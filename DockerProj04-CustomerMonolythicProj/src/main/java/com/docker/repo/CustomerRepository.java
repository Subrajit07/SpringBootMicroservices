package com.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
