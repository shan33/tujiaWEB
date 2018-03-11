package com.xls.springmvc.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xls.springmvc.User;
import com.xls.springmvc.dao.UserDao;

@Controller
@RequestMapping("/user")
public class UserController {
	
//	@Autowired() @Qualifier("userDao")
	@Resource(name="userDao")
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
		
	}
	
	
	@CrossOrigin
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	
	public Map<String, Boolean> addUser() {
			// HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("USER: // ADD");
		/*String name = (String) request.getAttribute("username");
		String pass = (String) request.getAttribute("userpass");
		String mino =  (String) request.getAttribute("minority");
		
		String hostName = request.getRemoteAddr();		//IP
		String url = request.getRequestURI();			//URL
		String method = request.getMethod();			//POST
		String query = request.getQueryString();		//query
		
		System.out.println("hostName: " + hostName);
		System.out.println("url: " + url);
		System.out.println("method： " + method);
		System.out.println("query: " + query);
		
		response.setCharacterEncoding("UTF-8");//设置将字符以"UTF-8"编码输出到客户端浏览器
		
		request.setAttribute("loginResult", true);
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods","POST");
		response.setHeader("Access-Control-Allow-Headers","Access-Control");
		response.setHeader("Allow","POST");
		*/
		
		//request.
		
//		System.out.println(name + "----" + pass + "----" + mino );
		//System.out.println(name );
		
//		response.setStatus(200);
		//boolean result = userDao.addUser(name, pass, mino);
		
//		boolean result = userDao.addUser("1", "2", 0);
		
		//request.setAttribute("loginResult", true);
		 //return "login_result";
		//add user successfully
		Map<String, Boolean> result = new HashMap();
		result.put("result", true);
		return result;
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

	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void loginUser(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
	}
	
	@RequestMapping("/update")
	public void updateUser() {
		
	}
	
	@RequestMapping("/message")
	public void getNewMessage() {
		
	}
	
	public void console(String str) {
		
	
	}
}
