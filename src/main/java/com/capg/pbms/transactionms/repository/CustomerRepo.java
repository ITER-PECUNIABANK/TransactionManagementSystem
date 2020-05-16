package com.capg.pbms.transactionms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.transactionms.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
