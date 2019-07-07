package com.mj.users;

public class Cars {
	
	private String carVIN;
	private String make;
	private String model;
	private int year;
	private double price;
	private int mileage;
	private String lot;
	
	

	public String getCarVIN() {
		return carVIN;
	}
	public void setCarVIN(String carVIN) {
		this.carVIN = carVIN;
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
	public double getPrice() {
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
	
	
	@Override
	public String toString() {
		return "Cars [carVIN=" + carVIN + ", make=" + make + ", model=" + model + ", year=" + year + ", price=" + price
				+ ", mileage=" + mileage + ", lot=" + lot + "]";
	}
	
	
	
}
