package com.xls.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("cultureDao")
public class CultureDao extends JdbcTemplate{
	public CultureDao() {
		super();
	}
	
	
}
