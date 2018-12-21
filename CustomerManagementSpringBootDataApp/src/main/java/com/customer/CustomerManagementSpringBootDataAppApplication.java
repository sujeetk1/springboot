package com.customer;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customer.entity.Customer;
import com.customer.service.CustomerManagementServiceImpl;

@SpringBootApplication
public class CustomerManagementSpringBootDataAppApplication implements CommandLineRunner{
	
	@Autowired
	CustomerManagementServiceImpl customerManagementServiceImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer cust = new Customer( "john", "max", "john@abc.com", new Date());
		Customer customer = customerManagementServiceImpl.createCustomer(cust);
		System.out.println(customer);
	}

}

