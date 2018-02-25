package com.xls.springmvc.controller;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xls.springmvc.User;
import com.xls.springmvc.dao.UserDao;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired() @Qualifier("userDao")
	private UserDao userDao;
	
	public UserController() {}
	
	@RequestMapping("/getUserName")
	public void getUserName(HttpServletResponse response) {
		
		Iterator<Map<String, String>> iterator = userDao.getUserNameList().iterator();
		Map<String, String> temp = null;
		while (iterator.hasNext()) {
			temp = iterator.next();
			System.out.println("name ---- " + temp.get("name"));
		}
//		response.
	}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public String addUser() {
		
		boolean result = userDao.addUser();
		
		//add user successfully
		if (result) {
			
		} else {
			
		}
		return "";
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	public String getUser() {
		
		System.out.println("UserController: ------- /getUser");

		Iterator<User> users = userDao.getUser().iterator();
		
		while (users.hasNext()) {
			System.out.println(users.next());
		}
		
		return "";
	}

	
	public void console(String str) {
		
	}
}
