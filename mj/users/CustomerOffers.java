package com.mj.users;

public class CustomerOffers {
	
	private Customers customers;
	private Cars cars;
	private int offerID;
	private double offerAmount;
	
	private int customerID;
	private String carVIN;
	
	public CustomerOffers(Customers customers, Cars cars, int offerID, double offerAmount, int customerID,
			String carVIN) {
		super();
		this.customers = customers;
		this.cars = cars;
		this.offerID = offerID;
		this.offerAmount = offerAmount;
		this.customerID = customerID;
		this.carVIN = carVIN;
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

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCarVIN() {
		return carVIN;
	}
	public void setCarVIN(String carVIN) {
		this.carVIN = carVIN;
	}

	@Override
	public String toString() {
		return "CustomerOffers [customers=" + customers + ", cars=" + cars + ", offerID=" + offerID + ", offerAmount="
				+ offerAmount + ", customerID=" + customerID + ", carVIN=" + carVIN + "]";
	}
	
	
	
	
	

}
