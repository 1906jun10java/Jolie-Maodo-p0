package com.mj.carservices;

import com.mj.users.Customers;

public interface CustomersTasks {
	

	public void viewAllCars();

	public void viewPaidCars(Customers customer);

	public void openAccount(String username, String password);

	public void makePayment(double paymentAmount, int carVIN);

}
