package com.sptpc.story.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sptpc.story.domain.Product;
import com.sptpc.story.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="findProByID")
	public ModelAndView getProductByID(String id){
		ModelAndView mv = null;
		Product product = productService.findProductByID(id);
		if(product != null){
			mv = new ModelAndView("product_info");
			mv.addObject("product", product);
		}
		return mv;
	}
	
	
}
