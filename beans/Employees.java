package com.mj.beans;

	public class Employees {
		
		private int empID;
		private String firstname;
		private String lastname;
		private String empemail;


		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
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

		public String getEmpemail() {
			return empemail;
		}
		public void setEmpemail(String empemail) {
			this.empemail = empemail;
		}


		public Employees(int empID, String firstname, String lastname, String empemail) {
			this.empID = empID;
			this.firstname = firstname;
			this.lastname = lastname;
			this.empemail = empemail;
			
		}
	
	}
