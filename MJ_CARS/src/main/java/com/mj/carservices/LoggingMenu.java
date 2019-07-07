package com.mj.carservices;

import java.util.Scanner;

public class LoggingMenu {
		
		private static String username;
		private static String password;
		private static int ch1;
		
		static Scanner sc = new Scanner(System.in);
		/* int choice; */
	
			public static boolean loggingoption(int ch) {
			  boolean validation = false;
				if (ch == 1) { 
					employeelogging();
				}
				else if (ch == 2) { 
					customerlogging(); 
				}
				else { System.out.println("!!!!Unvalid Entry");
				}
				
				//try {
					
				return validation;
			}
			
			public static void employeelogging() {
				System.out.println("Please provide your username");
				System.out.println(">>>");
				username = sc.nextLine();	
				
				System.out.println("Please provide your password");
				System.out.println(">>>");
				password = sc.nextLine();
			}
			
			public static void customerlogging() {
				System.out.println("Please provide your username");
				System.out.println(">>>");
				username = sc.nextLine();	
				
				System.out.println("Please provide your password");
				System.out.println(">>>");
				password = sc.nextLine();
			}
			

}
