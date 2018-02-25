package com.xls.springmvc;

public class User {
	private int id;
	private String username;
	private String userpass;
	private boolean minority;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public void setMinority(int minority) {
		this.minority = minority>0? true:false;
	}
	
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getUserpass() {
		return userpass;
	}
	public boolean getMinority() {
		return minority;
	}
	
	@Override
	public String toString() {
		return "name: " + this.getUsername() + " ---- password: " + this.getUserpass() + " ---- minority: " + 
				(this.getMinority()? "YES":"NO");
		
	}
}
