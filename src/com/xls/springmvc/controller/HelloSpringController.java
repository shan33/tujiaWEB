package com.xls.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloSpringController {
	
	/*@Autowired() @Qualifier("userDao")
	private UserDao userDao;*/
	
	@RequestMapping("/hello")
	public String test() {
		System.out.println("HelloSpringController: ------- /hello");
		return "hello";
	}
	
	
}
