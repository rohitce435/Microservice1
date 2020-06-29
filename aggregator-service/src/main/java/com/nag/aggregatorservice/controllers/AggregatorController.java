package com.nag.aggregatorservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nag.aggregatorservice.models.OrderList;
import com.nag.aggregatorservice.models.UserDataDto;
import com.nag.aggregatorservice.models.UserOrder;

@RestController
@RequestMapping("/orderDetails")
public class AggregatorController {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${USER_SERVICE_HOST}")
    private String userServiceHost;
     
    @Value("${USER_SERVICE_PORT}")
    private String userServicePort;
    
    @Value("${ORDER_SERVICE_HOST}")
    private String orderServiceHost;
     
    @Value("${ORDER_SERVICE_PORT}")
    private String orderServicePort;

	@RequestMapping("{userId}")
	public UserOrder getUserOrder(@PathVariable Integer userId) {
		System.out.println("112233");
		UserDataDto userDataDto = restTemplate.getForObject("http://"+ userServiceHost+ "/user/" + userId, UserDataDto.class);
		OrderList orderList = restTemplate.getForObject("http://"+ orderServiceHost+ "/orders/" + userId, OrderList.class);
//				UserDataDto userDataDto = restTemplate.getForObject("http://user-service:31002/user/" + userId, UserDataDto.class);
//			
//			OrderList orderList = restTemplate.getForObject("http://order-service:31003/orders/" + userId, OrderList.class);
				return new UserOrder(userDataDto, orderList);
	}
}
