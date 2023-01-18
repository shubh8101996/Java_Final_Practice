package FactoryDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysql extends Database {

	public Mysql() {

		setDriverName("com.mysql.cj.jdbc.Driver");

		try {
			Class.forName(getDriverName());

			setUsername("shubham");
			setPassword("AdminShubham@123");
			setDBurl("jdbc:mysql://localhost:3306/sample");

			Connection connection = DriverManager.getConnection(getDBurl(), getUsername(), getPassword());
			System.out.println("Connected Successfully Oracle Database ");
		} catch (Exception e) {

			System.out.println("Connection Failed");

		}

	}
}
