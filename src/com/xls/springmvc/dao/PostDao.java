package com.xls.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("postDao")
public class PostDao extends JdbcTemplate{
	
	public PostDao() {
		super();
	}
}
