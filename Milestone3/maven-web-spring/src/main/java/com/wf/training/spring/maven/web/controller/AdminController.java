package com.wf.training.spring.maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.spring.maven.web.dto.Users;

@Controller
@RequestMapping("/admin")
public class AdminController 
{
	@RequestMapping("/home")
	public String home() 
	{
		return "admin";
	}

	@RequestMapping("/addnewrepui")
	public String addNewRepUI(Model model) 
	{
		Users user = new Users();
		model.addAttribute("user",user);
		return "addbackofficerep";
	}

	@RequestMapping("/addnewrep")
	public String addNewRep(@ModelAttribute Users user) 
	{
		return "redirect:/admin/home";
	}

	@RequestMapping("/logout")
	public String logout() 
	{
		return "redirect:/login";
	}

	@RequestMapping("*")
	public String fallback() 
	{
		return "redirect:/admin/home";
	}
}