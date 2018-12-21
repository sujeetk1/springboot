package com.customer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;

@Repository
public interface CustomerManagementDao extends CrudRepository<Customer, Integer>{

}
