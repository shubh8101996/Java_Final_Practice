package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaOracleTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "tiger";

		try {
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected Successfully Database ");

			String sql = "INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME,EMP_SALARY) VALUES (?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setLong(1, 35);
			statement.setString(2, "mahesh");
			statement.setLong(3, 200000);
			int rows = statement.executeUpdate();

			System.out.println(rows);

			if (rows > 0) {

				System.out.println("row has been updated");
			}

			connection.close();
		} catch (SQLException e) {

			System.out.println("OOOOO Something Error: ");
			e.printStackTrace();
		}
	}

}
