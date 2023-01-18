package FactoryDesignPattern;

public abstract class Database {

	String driverName, username, password,DBurl;

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getDBurl() {
		return DBurl;
	}

	public void setDBurl(String dBurl) {
		DBurl = dBurl;
	}

	public void showConnectionDetails() {

		System.out.println("Driver Name : " + getDriverName());
		System.out.println("Username : " + getUsername());
		System.out.println("Password : " + getPassword());
		System.out.println("DBUrl : " + getDBurl());


	}

}
