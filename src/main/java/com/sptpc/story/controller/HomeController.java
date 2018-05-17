package com.sptpc.story.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sptpc.story.domain.Product;
import com.sptpc.story.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);//		
//		List<Product> productList = productService.getAllProducts();
		List<Product> hList = productService.getHotProducts();
		List<Product> nList = productService.getNewProducts();
		model.addAttribute("hlist", hList);
		model.addAttribute("nlist", nList);
		return "index";
	}
//	public ModelAndView home(){
//		ModelAndView mv = new ModelAndView("index");
//		//得到所有产品
//		List<Product> productList = productService.getAllProducts();		
//		mv.addObject("hlist", productList);
//		return mv;
//	}
	
	
	
}
