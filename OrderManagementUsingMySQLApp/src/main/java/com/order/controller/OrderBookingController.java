package com.order.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.order.entity.Order;
import com.order.service.OrderBookingService;

@EnableWebMvc
@RestController
@RequestMapping(value="/api/orders")
public class OrderBookingController {
	
	@Autowired
	private OrderBookingService orderBookingService;
	
	@PostMapping(value="/create")
	public Order bookOrder(@RequestBody Order order) {
		return orderBookingService.bookOrder(order);
	}
	
	@GetMapping(value="/order/{orderId}")
	public Order getOrderById(@PathVariable("orderId")Integer orderId) {
		return orderBookingService.getOrderById(orderId);
	}
	
	
	@GetMapping(value="/orderlist")
	public Iterable<Order> getAllOrder() {
		return orderBookingService.getAllOrder();
	}
	
	@DeleteMapping(value="/order/{orderId}")
	public void deleteById(@PathVariable("orderId") Integer orderId) {
		orderBookingService.deleteById(orderId);
	}
	
	@PutMapping(value="/updateorder/{orderId}")
	public Order updateOrder(@PathVariable("orderId") Integer orderId, @PathParam("email") String email) {
		return orderBookingService.updateOrder(orderId, email);
	}
	
}
