package FactoryDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle extends Database {

	public Oracle() {

		setDriverName("oracle.jdbc.driver.OracleDriver");

		try {
			Class.forName(getDriverName());

			setUsername("system");
			setPassword("tiger");
			setDBurl("jbdc:oracle:thin:@localhost:1521:orcl");

			Connection connection = DriverManager.getConnection(getDBurl(), getUsername(), getPassword());
			System.out.println("Connected Successfully Oracle Database ");
		} catch (Exception e) {

			System.out.println("Connection Failed");

		}

	}

}
