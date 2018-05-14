package com.sptpc.story.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sptpc.story.domain.User;
import com.sptpc.story.service.UserService;
import com.sptpc.story.utils.UUIDUtils;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="reg",method=RequestMethod.GET)
	public ModelAndView register(){
		ModelAndView mv = new ModelAndView("register");
		
		return mv;
		
	}
	@RequestMapping(value="reg",method=RequestMethod.POST)
	public ModelAndView registerForm(User user){
		ModelAndView mv = new ModelAndView("register");
		user.setUid(UUIDUtils.getUuids());
		int n = userService.register(user);
		if(n != 0){
			mv = new ModelAndView("index");
		}
		return mv;
	}
}
