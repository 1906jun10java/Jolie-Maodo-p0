package com.mj.beans;

public class Cars {
	
	private String VIN;
	private String make;
	private String model;
	private int year;
	private float price;
	private int mileage;
	private String lot;
	
	
	
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}


	public int getMileage() {
		return mileage;
	}
	public void setMileage(int milage) {
		this.mileage = milage;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	
	
}
