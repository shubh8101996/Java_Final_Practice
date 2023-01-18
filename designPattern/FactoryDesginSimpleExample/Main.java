package FactoryDesginSimpleExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Press 1 for Dog Sound");
		System.out.println("Press 2 for Cat Sound");
		System.out.println("Press 3 for Hen Sound");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input < 0 && input > 3) {

			System.out.println("Invalid input");
		} else {

			Animal s = AnimalFactory.getAnimal(DataType.values()[input - 1]);
			s.speak();

		}

	}

}
