package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class New {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "tiger";

		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Employees you want store? : ");
		int EmpCOunt = sc.nextInt();

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		Object[][] arr = new Object[EmpCOunt][3];
		
//		List list=new ArrayList();

		for (int i = 0; i <= EmpCOunt - 1; i++) {

			String sql = "INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME,EMP_SALARY) VALUES (?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			System.out.print("Enter Employee ID: ");

			statement.setString(1, (String) (arr[i][0] = sc.nextInt()));

			System.out.print("Enter Employee Salary: ");

			statement.setLong(3, (long) (arr[i][1] = sc.nextDouble()));

			sc.nextLine();

			System.out.print("Enter Employee Name: ");

			statement.setNString(2, (String) (arr[i][2] = sc.nextLine()));

			int rows = statement.executeUpdate();

			if (rows > 0) {

				System.out.println("row has been updated");
			}

			connection.close();

		}

		for (int i = 0; i < EmpCOunt; ++i) {
			System.out.println("Employee Details: ");
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.println(arr[i][j]);
			}

			System.out.println("------------------------");
		}

	}

}
