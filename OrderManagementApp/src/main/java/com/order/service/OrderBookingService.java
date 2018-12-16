package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.OrderBookingDao;
import com.order.entity.Order;

@Service
public class OrderBookingService {
	
	@Autowired
	private OrderBookingDao orderBookingDao;
	
	public Order bookOrder(Order order) {
		return orderBookingDao.save(order);
	}

	public Order getOrderById(Integer orderId) {
		return orderBookingDao.findById(orderId).get();
	}

	public Iterable<Order> getAllOrder() {
		return orderBookingDao.findAll();
	}

	public void deleteById(Integer orderId) {
		orderBookingDao.deleteById(orderId);		
	}

	public Order updateOrder(Integer orderId, String email) {
		Order odr = orderBookingDao.findById(orderId).get();
		odr.setEmail(email);
		return orderBookingDao.save(odr);
	}
}
