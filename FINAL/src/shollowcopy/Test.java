package shollowcopy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address a = new Address("Manajari road", "Pune");
		Person p = new Person("shubham", 28, a);

		System.out.println("************Before Clone*************");

		System.out.println(p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity());
		System.out.println(p.getAge());
		System.out.println(p.getName());

		Person p1 = p.Clone();

//		System.out.println(p1.age + "  " + p1.name + "  " + a.getCity() +"  " +a.getStreet());

		p1.getAddress().setCity("Mumbai");

		System.out.println("**********After Clone***********");

		System.out.println(p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity());
		System.out.println(p.getAge());
		System.out.println(p.getName());

	}

}
