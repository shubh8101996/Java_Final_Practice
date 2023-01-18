package abc;

public class StaticClass {

	static int number = 0;

	public static void increment() {

		number++;

	}

	public static void main(String[] args) {

		StaticClass.number = 10;
		StaticClass.increment();
		System.out.println(number);

	}

}
