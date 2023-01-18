package FactoryDesginSimpleExample;

public class AnimalFactory {

	public static Animal getAnimal(DataType type) {

		switch (type) {
		case DOG:
			return new Dog();
		case CAT:
			return new Cat();
		case HEN:
			return new Hen();
		default:
			return null;
		}
	}

}
