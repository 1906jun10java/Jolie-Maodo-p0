package com.mj.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mj.users.Cars;
import com.mj.utility.ConnectionService;

public class carDaoImpl implements carDao {

	public static ConnectionService cf = ConnectionService.getInstance();
	//private Connection conn = cf.getConnection();

	@Override
	public void createCar(Cars c) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO CARS VALUES(CARSEQ.NEXTVAL,?,?,?,?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getCarMake());
		ps.setString(2, c.getCarModel());
		ps.setInt(3, c.getYearMake());
		ps.setDouble(4, c.getPrice());
		ps.setInt(5, c.getMileage());
		ps.setString(6, c.getLot());
		ps.setString(7, c.getCar_Status());
		
		ps.executeUpdate();
	}

	// public List<Cars> getAllCars() throws SQLException;

	@Override
	public ArrayList<Cars> getAllCars() throws SQLException {

		ArrayList<Cars> carList = new ArrayList<>();
		
		
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR WHERE CAR_STATUS = 'Actif' ");

			Cars c = null;

			while (rs.next()) {
				carList.add(new Cars(rs.getInt(1), rs.getString("CAR_MAKE"), rs.getString("CAR_MODEL"),
						rs.getInt("YEAR_MAKE"), rs.getDouble("PRICE"), rs.getInt("MILEAGE"), rs.getString("LOT"),
						rs.getString("CAR_STATUS")));
			}

		return carList;
	}

	
	
	@Override

	public List<Cars> getCarByVIN(Integer VIN) {

		ArrayList<Cars> carList = new ArrayList<>();
		carList = null;
		
		String sql = "SELECT * FROM CARS WHERE CAR_VIN =  VIN ";

		try {
			Statement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);

				if (rs.next()) {
				
					carList.add(new Cars(rs.getInt(1), rs.getString("CAR_MAKE"), rs.getString("CAR_MODEL"),
						rs.getInt("YEAR_MAKE"), rs.getDouble("PRICE"), rs.getInt("MILEAGE"), rs.getString("LOT"),
						rs.getString("CAR_STATUS")));
				}

		} catch (SQLException e) {
				e.printStackTrace();
		}
		return carList;
	}
	
}
