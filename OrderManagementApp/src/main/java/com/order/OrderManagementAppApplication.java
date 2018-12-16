package com.order;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.order.entity.Order;
import com.order.service.OrderBookingService;

@SpringBootApplication
public class OrderManagementAppApplication {

	public static void main(String[] args) {
		
		try {
		ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(OrderManagementAppApplication.class, args);
		
		OrderBookingService orderBookingService = configurableApplicationContext.getBean(OrderBookingService.class);
		
		Order order = new Order();
		order.setProductName("laptop");	
		order.setOrderDate(new Date());
		order.setOrderDestination("chennai");
		order.setEmail("sujeet.com@gmail.com");
		
		
			
		orderBookingService.bookOrder(order);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

