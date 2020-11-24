package com.wf.training.spring.maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.spring.maven.web.dto.Users;

@Controller
public class LoginController 
{
	@RequestMapping("/")
	public String home(Model model) 
	{
		Users user = new Users();
		model.addAttribute("user",user);
		return "index";
	}

	@PostMapping("/login")
	public String saveProfile(@ModelAttribute Users user) 
	{	
		String returnpage = "investor";
		if(user.getUsername().equals("admin") && user.getPassword().equals("admin")) 
		{
			returnpage= "admin";
		}
		else if(user.getUsername().equals("bor") && user.getPassword().equals("bor")) 
		{
			returnpage= "backofficerep";
		}
		return returnpage;
	}

	@RequestMapping("*")
	public String fallback() 
	{
		return "redirect:/";
	}
}