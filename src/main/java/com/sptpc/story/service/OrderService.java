package com.sptpc.story.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.story.domain.Orders;
import com.sptpc.story.domain.Product;
import com.sptpc.story.persistence.OrderMapper;

@Service
public class OrderService {
	@Autowired
	private OrderMapper orderMapper;

	public int buyProduct(Orders order) {
		// TODO Auto-generated method stub
		return orderMapper.insertProduct(order);
	}

}
