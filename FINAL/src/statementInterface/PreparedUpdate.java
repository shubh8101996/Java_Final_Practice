package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedUpdate {

	static Connection connection;
	static String dbURL;
	static String username;
	static String password;
	static PreparedStatement statement;

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		username = "system";
		password = "tiger";

		try {
			connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected Successfully Database ");
			int time = DriverManager.getLoginTimeout();
			System.out.println(time);

			String sql = "delete from employee where emp_id=?";
			statement = connection.prepareStatement(sql);

			statement.setLong(1, 90);

			int result = statement.executeUpdate();

			System.out.println(result + " record deleted");
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			try {
				if (connection != null)
					connection.close();
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
