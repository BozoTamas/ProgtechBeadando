package com.models.db_models;

public class Payment {
	private int id;
	private String method;
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getMethod() {
		return method;
	}
	
	private void setMethod() {
		this.method = method;
	}
}