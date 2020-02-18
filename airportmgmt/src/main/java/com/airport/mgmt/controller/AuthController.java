package com.airport.mgmt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airport.mgmt.form.User;
import com.airport.mgmt.service.UserService;

@Controller
public class AuthController {
	
	private UserService userService;
	
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login")
	public String welcome(Model model) 
	{
		return "login";
	}
	
	@RequestMapping(value = "/register")
	public String home(Model model) 
	{
		System.out.println("inside register");
		return "register";
	}
	
	@RequestMapping(value="/login/auth")
	public String authentication(@ModelAttribute("userForm")User user)
	{
		System.out.println("Inside authentication controller"+user.getUserName());
	boolean v=userService.getUserByName(user.getUserName(),user.getPassword(),user.getUserType());
	System.out.println("Inside "+v);
	if(v==true && user.getUserType().equals("Admin") )
	{
		return "home";
	}if(v==true && user.getUserType().equals("Manager") )
	{
		return "home";
	}
	else 
	{
		return "login";
	}
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("userRegister")@Validated User user,BindingResult bindingResult,Model model)
	{
			System.out.println("Inside add User");
			Random rand=new Random();
			int num=rand.nextInt(900000)+1000000;
			user.setId(num);
			System.out.println(user.getUserType()+user.getUserName()+user.getPassword()+user.getFirstName()+user.getLastName()+user.getEmail()+user.getGender()+user.getAge()+user.getContactNumber()+user.getApproval()+user.getId());
			System.out.println("Before add user");
			userService.addUser(user);
		return "login";
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		System.out.println("Entered");
		model.addAttribute("message",
				"You have successfully logged off from application !");
		return "login";
	}
	@RequestMapping(value = "/loginError", method = RequestMethod.GET)
	public String loginError(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}

}
