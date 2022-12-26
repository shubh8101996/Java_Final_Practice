package abc;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int EMP_id;
		String EMP_name;
		double EMP_salary;

		System.out.println("Enter Employee Name: ");
		EMP_name = sc.nextLine();

		System.out.println("Enter Employee ID: ");
		EMP_id = sc.nextInt();

		System.out.println("Enter Employee Salary: ");
		EMP_salary = sc.nextDouble();

		System.out.println("--------------------------------------------");

		System.out.println("Emp Name:  " + EMP_name);
		System.out.println("Emp ID:  " + EMP_id);
		System.out.println("Emp Salary:  " + EMP_salary);

		System.out.println("---------------------------------------------");

	}

}
