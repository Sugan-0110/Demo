package com.airport.mgmt.controller;

import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airport.mgmt.form.User;
import com.airport.mgmt.service.UserService;

@Controller


public class UserRegisterController {

/*	private static Logger log=Logger.getLogger(PlaneController.class);
private UserService userService;
	
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping(value="/")
	public String userRegister(Model model)
	{
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("userRegister")@Validated User user,BindingResult bindingResult,Model model)
	{
			log.info("Inside add User");
			Random rand=new Random();
			int num=rand.nextInt(900000)+1000000;
			user.setId(num);
			log.info("Before add user");
			userService.addUser(user);
		return "redirect:/home/";
	}

	
*/	

	
}
