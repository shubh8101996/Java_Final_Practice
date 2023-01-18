package FactoryDesignPattern;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {

		System.out.println("Press 1 for Mysql  :");
		System.out.println("Press 2 for Oracle  :");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n < 0 && n > 2) {

			System.out.println("Invalid Input");

		} else {

			Database db = DatabaseFactory.createDatabaseObject(DatabaseType.values()[n - 1]);
			db.showConnectionDetails();
		}

	}

}
