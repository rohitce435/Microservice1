package com.nag.orderservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.orderservice.models.OrderData;
import com.nag.orderservice.models.OrderList;

@RestController
@RequestMapping("/orders")
public class OrderDataController {

	@RequestMapping("/{userId}")
	public OrderList getOrdersByUserId(@PathVariable Integer userId) {
		OrderList orderList = new OrderList();
		List<OrderData> orderDatas = new ArrayList<OrderData>();
		orderDatas.add(new OrderData(1,"250", "14-Apr-2020"));
		orderDatas.add(new OrderData(2,"450", "15-Apr-2020"));
		orderList.setOrders(orderDatas);
		return orderList;
	}
}
