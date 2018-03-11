package com.xls.springmvc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xls.springmvc.User;

@Repository("userDao")
public class UserDao extends JdbcTemplate{
//	public static final String USER_SQL = "select * from user";
//	private JdbcTemplate template;
	public UserDao() {
		super();
	}
	
	

	/* User name list
	 * @return
	 * */
	public List<Map<String, String>> getUserNameList() {
		System.out.println("UserDao ------- getUserList()");
		
		String getUserName = "select NAME from user";
		List<Map<String, String>> result = this.query(getUserName, new RowMapper<Map<String, String>>() {
			@Override
			public Map<String, String> mapRow(ResultSet re, int index) throws SQLException {
				Map<String, String> map = new HashMap<String, String>();
				map.put("name", re.getString("NAME")+ "=" + index );	
				return map; 
			}
		});
		return result;
	}
	
	/* user list
	 * 
	 * @return
	 * */
	public List<User> getUser() {
		String getUserSql = "select * from user";
		//RowMapper<User> usersMapper = new BeanPropertyRowMapper<>(User.class);
		List<User> map = this.query(getUserSql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet re, int index) throws SQLException {
				User u = new User();
				u.setId(index);
//				System.out.println(re.getString(1) +"\t" + re.getString(2) + "\t" + re.getString(3));
				u.setUsername(re.getString(2));
				u.setUserpass(re.getNString(3));
				u.setMinority( Integer.parseInt(re.getString(4)) );
				return u;
			}
		});
		return map;
		
		
	}
	
	/* add or register user
	 * @param: 
	 * */
	public boolean addUser(String name, String pass, int minority) {
		String addUser = "insert into user (NAME, PASSWORD, MINORITY) values (?, ?, ?)";
		int result = this.update(addUser, name, pass, minority);
		return result>0? true:false;
	}
	
	public boolean loginUser(String name, String pass) {
		String loginUser = "select * from user where NAME='" + name + "' AND PASSWORD='" +pass + "'";
		int result = 1; //this.query(loginUser);
		return result>0?true:false;
	}
	
	public void updateUser() {
		
	}
	
	public void getNewMessage() {
		
	}
}
