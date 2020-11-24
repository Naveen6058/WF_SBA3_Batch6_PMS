package com.wf.training.spring.maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.spring.maven.web.dto.Commodity;
import com.wf.training.spring.maven.web.dto.Company;
import com.wf.training.spring.maven.web.dto.StockPrices;

@Controller
@RequestMapping("/backofficerep")
public class BackofficerepController 
{
	@RequestMapping("/home")
	public String home() 
	{
		return "backofficerep";
	}

	@RequestMapping("/addnewcompanyui") 
	public String addNewCompanyUI(Model model) 
	{
		Company company = new Company();
		model.addAttribute("company",company);
		return "addcompany";
	}

	@RequestMapping("/addnewcompany") // /student/home
	public String addNewCompany(@ModelAttribute Company company) 
	{
		return "redirect:/backofficerep/home";
	}

	@RequestMapping("/addstockpricesui") 
	public String addStockPricesUI(Model model) 
	{
		StockPrices stockprices = new StockPrices();
		model.addAttribute("stockprices",stockprices);
		return "stockprices";
	}

	@RequestMapping("/addstockprices") 
	public String addStockPrices(@ModelAttribute StockPrices stockprices) 
	{
		return "redirect:/backofficerep/home";
	}

	@RequestMapping("/addcommodityui") // /student/home
	public String addCommodityUI(Model model) 
	{
		Commodity commodity = new Commodity();
		model.addAttribute("commodity",commodity);
		return "addcommodity";
	}

	@RequestMapping("/addcommodity") // /student/home
	public String addCommodity(@ModelAttribute Commodity commodity) 
	{
		return "redirect:/backofficerep/home";
	}

	@RequestMapping("/generatecommissionreport") 
	public String generateCommissionReport(Model model) 
	{
		return "commissionreport";
	}

	@RequestMapping("/sendcommissionreport") 
	public String sendCommissionReport() 
	{
		return "redirect:/backofficerep/home";
	}

	@RequestMapping("/logout") 
	public String logout() 
	{
		System.out.println("logged out");
		return "redirect:/login";
	}

	@RequestMapping("*")
	public String fallback() 
	{
		return "redirect:/backofficerep/home";
	}
}
