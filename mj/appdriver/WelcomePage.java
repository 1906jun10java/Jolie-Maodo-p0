package com.mj.appdriver;

import java.util.Scanner;

	public class WelcomePage {

		public static int choice;
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("||               ***MJ_Car Dealership***                 ||");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.println("                 PLEASE SELECT AN OPTION                   ");
			System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.print("\n||               1: View cars for sale                   ||");
			System.out.print("\n||               2: Customer Registration                ||");
			System.out.print("\n||               3: Search for a car                     ||");
			System.out.print("\n||               4: Login                                ||");
			System.out.print("\n||               5: Exit App                             ||");
			System.out.println("");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				
			choice = sc.nextInt();
				
				while (choice < 1 || choice > 5) {
					System.out.println("!!!Invalid entry: please try again,");
					
					choice = sc.nextInt();
				}
				
				switch (choice) {
			
				case 1 :
					System.out.println("Here is the list of cars available for sale: ");
					break;
			
				case 2:
					System.out.println("Please enter the first number ");
					break;
					
				case 3:
			
					System.out.println("Please provide the car specifications ");
					break;
					
				case 4:
					
					System.out.println("Would you like to log as Employee or as Customer? ");
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
