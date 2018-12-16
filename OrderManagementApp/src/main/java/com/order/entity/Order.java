package com.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_tab")
public class Order {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="order_id")
		private Integer orderId;
		
		@Column(name="product_name", nullable=false)
		private String productName;
		
		@Column(name="order_date")
		private Date orderDate;
		
		@Column(name="order_destination")
		private String orderDestination;
		
		@Column(name="email")
		private String email;

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public String getOrderDestination() {
			return orderDestination;
		}

		public void setOrderDestination(String orderDestination) {
			this.orderDestination = orderDestination;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
