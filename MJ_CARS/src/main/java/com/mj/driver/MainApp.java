package com.mj.driver;

import java.sql.SQLException;
import java.util.Scanner;
import com.mj.daos.carDaoImpl;
import com.mj.utility.MainMenu;
import com.mj.utility.UserInputs;

public class MainApp {

	public static void main(String[] args) {
		
	 carDaoImpl c = new carDaoImpl ();

		
		 //MainMenu.menu1(); Use
		 //rInputs.userprompt();
		
		try {
			c.getAllCars();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
