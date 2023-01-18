package collection;

import java.util.*;

public class ListIteratorCursor {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			int index = iterator.nextIndex();
			System.out.println(element);
			System.out.println(index);

		}

		System.out.println("*********-----------------------*******************");

		while (iterator.hasPrevious()) {
			String element = iterator.previous();
			int index = iterator.nextIndex();

			System.out.println(element);
			System.out.println(index);

		}
	}

}
