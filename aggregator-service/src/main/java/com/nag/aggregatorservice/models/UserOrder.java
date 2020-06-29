package com.nag.aggregatorservice.models;

public class UserOrder {
	UserDataDto userDetails;
	OrderList orders;

	public UserOrder(UserDataDto userDetails, OrderList orders) {
		super();
		this.userDetails = userDetails;
		this.orders = orders;
	}

	public UserDataDto getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDataDto userDetails) {
		this.userDetails = userDetails;
	}

	public OrderList getOrders() {
		return orders;
	}

	public void setOrders(OrderList orders) {
		this.orders = orders;
	}
}
