package com.xls.springmvc.controller;

import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xls.springmvc.dao.UserDao;


@Controller
public class HelloSpringController {
	
	@Autowired() @Qualifier("userDao")
	private UserDao userDao;
	
	@RequestMapping("/hello")
	public String test() {
		System.out.println("HelloSpringController: ------- /hello");
		return "hello";
	}
	
	
}
