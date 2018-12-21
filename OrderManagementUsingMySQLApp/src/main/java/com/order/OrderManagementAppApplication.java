package com.order;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.order.entity.Order;
import com.order.service.OrderBookingService;

@SpringBootApplication
public class OrderManagementAppApplication implements CommandLineRunner {

	@Autowired
	OrderBookingService orderBookingService;
	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {

		SpringApplication.run(OrderManagementAppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource ::"+dataSource);
		
		Order order = new Order();
		order.setProductName("laptop");
		order.setOrderDate(new Date());
		order.setOrderDestination("chennai");
		order.setEmail("sujeetk1@abc.com");
		orderBookingService.bookOrder(order);
	}

}
