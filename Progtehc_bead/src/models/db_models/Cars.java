 package com.models.db_models;
 
 public class Cars {
	private int id;
	private String manufacturer;
	private String model;
	private int price_per_day;
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	private void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	private void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice_per_day() {
		return price_per_day;
	}
	
	private void setPrice_per_day(int price_per_day) {
		this.price_per_day = price_per_day;
	}
 }