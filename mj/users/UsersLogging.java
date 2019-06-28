package com.mj.users;

public abstract class UsersLogging {
	
	static String username;
	static String password; 
	
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		UsersLogging.username = username;
	}

	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		UsersLogging.password = password;
	}


	interface Logging {
		
		static String addusername(int id) {
		return username;
		}
		static String addpassword() {
			return password;
		}
			
	}
}
