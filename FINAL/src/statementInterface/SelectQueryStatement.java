package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "tiger";

		Connection connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected Successfully Database ");

		String sql = "select * from REGISTRATION";

		Statement statment = connection.createStatement();

		ResultSet result = statment.executeQuery(sql);

		System.out.println(result + " records affected");

		while (result.next()) {

			String id = result.getString("id");
			String first = result.getString("first");
			String last = result.getString("last");
			String age = result.getString("age");

			System.out.println(id + "  " + first + "  " + last + " " + age);

//			System.out.println(emp_id);
//			System.out.println(emp_name);
//			System.out.println(emp_salary);

		}

		connection.close();

	}

}
