package abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDetails {

	public static void main(String[] args) throws Exception {

		int id = 0;
		String name = null;
		int salary = 0;
		int rows = 0;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "tiger";

		Connection connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected Successfully Database ");

		String sql = "INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME,EMP_SALARY) VALUES (?,?,?)";

		PreparedStatement statement = connection.prepareStatement(sql);

		System.out.println("How Many Employee you want entroll:  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		try {
			for (int i = 1; i <= count; i++) {

				System.out.println("Enter the ID: ");

				id = Integer.parseInt(br.readLine());

				statement.setLong(1, id);

				System.out.println("Enter Emp Name: ");

				name = br.readLine();

				statement.setString(2, name);

				System.out.println("Enter the Emp Salary: ");
				salary = Integer.parseInt(br.readLine());

				statement.setLong(3, salary);

				rows = statement.executeUpdate();
//			System.out.println(rows);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

//		if (rows > 0) {
//
//			System.out.println("row has been updated");
//		}

		connection.close();

	}

}
