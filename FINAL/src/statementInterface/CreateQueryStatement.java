package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateQueryStatement {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
			String username = "system";
			String password = "tiger";

			Connection connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected Successfully Database ");

			Statement statment = connection.createStatement();

			String sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";

			statment.executeUpdate(sql);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
