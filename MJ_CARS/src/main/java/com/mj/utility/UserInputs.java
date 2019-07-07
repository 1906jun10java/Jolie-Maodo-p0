package com.mj.utility;


	import java.util.Scanner;

import com.mj.carservices.LoggingMenu;
import com.mj.users.Cars;
	import com.mj.users.Customers;
	

	public class UserInputs {
		
		private static Scanner sc = new Scanner (System.in);
		//static int ch1;
		private static UserInputs instance;

		private UserInputs() {
		
		}
		 
		//Static method to get the unique instance- if it does not exist
		//we will create it
		public static synchronized UserInputs getInstance() {
			
		if(instance==null) {
		instance= new UserInputs();
		}
		return instance;

		}
		public static void userprompt() {
			int choice;
			int ch1;
			choice = sc.nextInt();
			while (choice < 1 || choice > 5) {
				System.out.println("!!!Invalid entry: please try again,");
				System.out.println(">>>");
				choice = sc.nextInt();
				
			}

			switch (choice) {
		
			case 1 :
				System.out.println("Here is the list of cars available for sale: ");
				//Diplay all available cars for sale by selecting all cars where status != not actif
				//Cars.carDoaImpl();
				
				break;
		
			case 2:
				System.out.println("Please enter your information ");
			
				//Customers.createcustomer();
				break;
				
			case 3:
		
				System.out.println("Please provide the car specifications ");
				break;
				
			case 4:
				
				System.out.print("Would you like to log as \n 1:Employee or as \n 2: Customer? ");
				ch1 = sc.nextInt();
				LoggingMenu.loggingoption(ch1);
				
				break;
				
			case 5:
				System.out.println("Thank you for visiting MJ_CarDealership ");
				break;
				
			default:
			{ 
				System.out.println("Next time");
			}
			sc.close();
			}
				

	}

}
