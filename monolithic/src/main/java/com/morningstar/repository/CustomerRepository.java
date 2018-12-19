package com.morningstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morningstar.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
