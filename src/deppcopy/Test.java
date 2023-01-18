package deppcopy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p = new Person("shubham", 28, "Pune");

		System.out.println("************Before Clone*************");

		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		System.out.println(p.getName());

		Person p1 = p.Clone();

//		System.out.println(p1.age + "  " + p1.name + "  " + a.getCity() +"  " +a.getStreet());

		p1.setAddress("Mumbai");
		p1.setName("Anant");

		System.out.println("**********After Clone***********");

		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		System.out.println(p.getName());

	}

}
