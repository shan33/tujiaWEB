package com.xls.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/market")
public class MarketController {
	
	@RequestMapping("/addSale")
	public void addSale() {
		
	}
	
	@RequestMapping("/sales") 
	public void getSales() {
		
	}
}
