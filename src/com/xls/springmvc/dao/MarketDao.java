package com.xls.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("marketDao")
public class MarketDao extends JdbcTemplate{
	public MarketDao() {
		super();
	}
}
