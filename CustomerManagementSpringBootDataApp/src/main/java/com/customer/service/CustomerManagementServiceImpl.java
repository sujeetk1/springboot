package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerManagementDao;
import com.customer.entity.Customer;

@Service
public class CustomerManagementServiceImpl implements CustomerManagementService {
	
	@Autowired
	CustomerManagementDao customerManagementDao;
	public Customer createCustomer(Customer cust) {
		return customerManagementDao.save(cust);
		
	}

}
