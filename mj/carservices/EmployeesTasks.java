package com.mj.carservices;

import com.mj.users.CustomerOffers;
import com.mj.users.Customers;

public interface EmployeesTasks {

		public CustomerOffers acceptOffer(int offerId);

		public CustomerOffers rejectOffer(int offerId);

		public void addNewCar(int carVIN, String make, String model, double price, int year);

		public void removeCar(int carVIN);

		public void createEmployeeAccount(String empID, String password);

	

}
