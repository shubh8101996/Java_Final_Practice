package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQueryStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "tiger";

		Connection connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected Successfully Database ");

		String sql = "delete from employee where emp_id=31";

		Statement statment = connection.createStatement();

		int result = statment.executeUpdate(sql);

		System.out.println(result + " records affected");

		connection.close();

	}

}
