package com.mj.beans;

import com.mj.users.Cars;

public class CarBuilder {
		
		public static void main(String[] args) {

	
		   Cars c1 = new Cars();
		
			c1.setMake("Toyata");
			c1.setModel("Camri");
			c1.setMileage(1000);
			c1.setYear(2016);
			c1.setPrice(12000);
			c1.setCarVIN("AAA123");
			
			
			Cars c2 = new Cars();
			c2.setMake("Hunday");
			c2.setModel("Civic");
			c2.setMileage(50000);
			c2.setYear(2014);
			c2.setPrice(10000);
			c2.setCarVIN("AAA124");
		
			Cars c3 = new Cars();
			c3.setMake("Peugeot");
			c3.setModel("Macarina");
			c3.setMileage(0);
			c3.setYear(2019);
			c3.setPrice(35000);
			c3.setCarVIN("AAA125");
			
		
			
			
		}
			

}
