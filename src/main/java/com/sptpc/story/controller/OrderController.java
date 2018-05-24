package com.sptpc.story.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sptpc.story.domain.Orders;
import com.sptpc.story.domain.Product;
import com.sptpc.story.domain.User;
import com.sptpc.story.service.OrderService;
import com.sptpc.story.utils.UUIDUtils;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="order",method=RequestMethod.POST)
	public String buy(Orders order,HttpSession session){
		User user = (User) session.getAttribute("user");
		if(user == null){
			return "login";
		}else{
			order.setOid(UUIDUtils.getUuids());
			order.setOrdertime(new Date());
			int n = orderService.buyProduct(order);
			if(n != 0){
				return "order_list";
			}else{
				return "";
			}
		}
		
		
	}
}
