package com.models.db_models;

public class Users {
	private int id;
	private String username;
	private String password;
	private String email;
	private String first_name;
	private String last_name;
	private String address;
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	private void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	private void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	private void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getAddress() {
		return address;
	}
	
	private void setAddress(String address) {
		this.address = address;
	}
}
