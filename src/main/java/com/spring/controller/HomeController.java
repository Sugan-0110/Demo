	package com.spring.controller;
	
	import java.text.DateFormat;
	import java.util.Date;
	import java.util.Locale;
	
	import org.omg.CORBA.Request;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	
	import com.spring.model.Home;
	
	@Controller
	public class HomeController {
		
		@RequestMapping(value="/")
		public String home(Locale locale,Model model)
		{
			System.out.println("Home Page Requested, locale = " + locale);
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	
			String formattedDate = dateFormat.format(date);
	
			model.addAttribute("serverTime", formattedDate);
	
			return "index";
	
			
		}
		
		
		@RequestMapping(value="/User")
		public String user(Home user,Model model) {
			System.out.println("User Page Requested");
			model.addAttribute("userName", user.getUserName());
			return "home";
		}
	
		
		
	
	}
