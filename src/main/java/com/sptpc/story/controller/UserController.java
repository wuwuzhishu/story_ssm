package com.sptpc.story.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
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
			mv = new ModelAndView("login");
		}
		return mv;
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mv = new ModelAndView("login");
		return mv;
		
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView loginForm(String username,String password,HttpSession session){
		ModelAndView mv = new ModelAndView("login");
		User user = userService.getUserByNameAndPwd(username, password);
		if(user != null){			
			mv = new ModelAndView("redirect:/");
			session.setAttribute("user", user);			
		}else{
			mv.addObject("msg", "用户名或密码错误");
		}
		return mv;
	}
	
//	@RequestMapping(value="login",method=RequestMethod.POST)
//	public String loginForm(String username,String password,
//			HttpSession session,Model model){		
//		User user = userService.getUserByNameAndPwd(username, password);
//		if(user != null){			
//			session.setAttribute("user", user);
//			return "redirect:/";
//			
//		}else{
//			model.addAttribute("msg", "用户名或密码错误");
//			return "login";
//		}
//		
//	}
	
	@RequestMapping(value="logout")
	public String logout(HttpSession session){
		if(session.getAttribute("user")!=null){
			session.removeAttribute("user");
		}
		return "redirect:/";
	}
	
}
