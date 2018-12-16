package com.order.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.order.entity.Order;

@Repository
public interface OrderBookingDao extends CrudRepository<Order, Integer>{

}
