package com.mj.users;

public class CustomerOffer {
	
	
	private Customers customers;
	private Cars cars;
	private int offerID;
	private double offerAmount;
	
	
	public CustomerOffer(Customers customers, Cars cars, int offerID, double offerAmount) {
		super();
		this.customers = customers;
		this.cars = cars;
		this.offerID = offerID;
		this.offerAmount = offerAmount;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	public int getOfferID() {
		return offerID;
	}
	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}
	public double getOfferAmount() {
		return offerAmount;
	}
	public void setOfferAmount(double offerAmount) {
		this.offerAmount = offerAmount;
	}
	
	
	@Override
	public String toString() {
		return "CustomerOffer [customers=" + customers + ", cars=" + cars + ", offerID=" + offerID + ", offerAmount="
				+ offerAmount + "]";
	}
	
	
	

}
