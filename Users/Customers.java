package com.mj.users;

	public class Customers {
		
		private int customerID;
		private String firstname;
		private String lastname;
		private String custemail;
	
		public Customers(int customerID, String firstname, String lastname, String custemail) {
			this.customerID = customerID;
			this.firstname = firstname;
			this.lastname = lastname;
			this.custemail = custemail; 
			
			
			
		}
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getCustemail() {
			return custemail;
		}
		public void setCustemail(String custemail) {
			this.custemail = custemail;
		}
	
	}
