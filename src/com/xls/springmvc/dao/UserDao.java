package com.xls.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.xls.springmvc.User;

@Repository("userDao")
public class UserDao extends JdbcDaoSupport{
//	public static final String USER_SQL = "select * from user";
//	private JdbcTemplate template;
	public UserDao() {
		super();
	}
	
	/*
	 * user's name list
	 * */
	public List<Map<String, String>> getUserNameList() {
		System.out.println("UserDao ------- getUserList()");
		
		String getUserName = "select NAME from user";
		List<Map<String, String>> result = super.getJdbcTemplate().query(getUserName, new RowMapper<Map<String, String>>() {
			@Override
			public Map<String, String> mapRow(ResultSet re, int index) throws SQLException {
				Map<String, String> map = new HashMap<String, String>();
				map.put("name", re.getString("NAME")+ "=" + index );	
				return map; 
			}
		});
		return result;
	}
	
	/*
	 * user list
	 * */
	public List<User> getUser() {
		String getUserSql = "select * from user";
		//RowMapper<User> usersMapper = new BeanPropertyRowMapper<>(User.class);
		List<User> map = super.getJdbcTemplate().query(getUserSql, new RowMapper<User>() {
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
	
	/*
	 * add user
	 * */
	public boolean addUser() {
		String addUser = "insert into user (NAME, PASSWORD, MINORITY) values (?, ?, ?)";
		int result = super.getJdbcTemplate().update(addUser, "111", "222", 0);
		return result>0? true:false;
	}
}
