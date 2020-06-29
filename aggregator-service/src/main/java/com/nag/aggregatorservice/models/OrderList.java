package com.nag.aggregatorservice.models;

import java.util.List;

public class OrderList {
	List<OrderData> orders;

	public OrderList() {
		super();
	}

	public List<OrderData> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderData> orders) {
		this.orders = orders;
	}

	
}
