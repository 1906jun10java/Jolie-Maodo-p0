package com.mj.utilities;

import java.util.Scanner;

import com.mj.users.Customers;

	public class CustomerRegistration {
	
			Scanner sc = new java.util.Scanner(System.in);

			public void addnewcustomer() {
				System.out.println("Please provide your first name");
				Customers.firstname = sc.nextLine();
				
				System.out.println("Please provide your last name");
				Customers.lastname = sc.nextLine();
				
				System.out.println("Please provide your email address");
				Customers.custemail = sc.nextLine();
		
		
	}
	
	
}