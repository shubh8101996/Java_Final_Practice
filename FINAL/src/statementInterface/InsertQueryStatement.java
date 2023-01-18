package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "tiger";

		Connection connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected Successfully Database ");

		String sql = "INSERT INTO REGISTRATION (id,first,last,age) " + "VALUES (101,'shubham','shedge',27)";

		Statement statment = connection.createStatement();

		int result = statment.executeUpdate(sql);

		System.out.println(result + " records affected");

		connection.close();

	}

}
