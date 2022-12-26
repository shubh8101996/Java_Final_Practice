package preparedStatementInterface;

import java.sql.*;;

public class AllQueryPgm {

	static Connection connection;
	static String dbURL;
	static String username;
	static String password;
	static PreparedStatement statement;
//	public static final String TableName;

	public static void createConnection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		dbURL = "jbdc:oracle:thin:@localhost:1521:orcl";
		username = "system";
		password = "tiger";

		connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected Successfully Database ");
		int time = DriverManager.getLoginTimeout();
		System.out.println(time);

	}

	public static void insertData(String tablename, int id, String name, int salary) throws SQLException {

		String sql = "INSERT INTO " + tablename + " (EMP_ID,EMP_NAME,EMP_SALARY) VALUES (?,?,?)";
		statement = connection.prepareStatement(sql);

		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setLong(3, salary);

		int row = statement.executeUpdate();

		if (row > 0) {

			System.out.println("row has been inserted");
		}

	}

	public static void closeConnection() throws SQLException {

		connection.close();
		System.out.println("Connection Successfully Closed");
	}

	public static void updateData() throws SQLException {

		String sql = "UPDATE EMPLOYEE SET emp_name=? where emp_id=?";
		statement = connection.prepareStatement(sql);

		statement.setString(1, "ramesh");
		statement.setInt(2, 33);

		int result = statement.executeUpdate();

		if (result > 0) {

			System.out.println("row has been updated");
		}

	}

	public static void deleteData() throws SQLException {

		String sql = "delete from employee where emp_id=?";
		statement = connection.prepareStatement(sql);

		statement.setLong(1, 303);

		int result = statement.executeUpdate();

		System.out.println(result + " record deleted");

	}

	public static void readMetaData() throws SQLException {

		String sql = "select * from customer";
		statement = connection.prepareStatement(sql);

		ResultSet rs = statement.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();

//		System.out.println("Table Name: "+rsmd.getTableName(0));  
		System.out.println("Total columns: " + rsmd.getColumnCount());
		System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
		System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(3));

	}

	public static void readData() throws SQLException {

		String sql = "select * from employee";
		statement = connection.prepareStatement(sql);

		ResultSet result = statement.executeQuery();

		while (result.next()) {

			String emp_id = result.getString("emp_id");
			String emp_name = result.getString("emp_name");
			String emp_salary = result.getString("emp_salary");

			System.out.println(emp_id + "  " + emp_name + "  " + emp_salary);
		}
	}

	public static void readSpecificData() throws SQLException {

		String sql = "select cust_city from customer where cust_code=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, "C00019");
		ResultSet result = statement.executeQuery();

		while (result.next()) {
			System.out.println(result.getString(1));
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		createConnection();
//		insertData("EMPLOYEE",202,"shubham",50000);
//		updateData();
//		deleteData();
//		readMetaData();
		readData();
//		readSpecificData();
		closeConnection();

	}

}
