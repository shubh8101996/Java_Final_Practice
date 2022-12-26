package collection;

import java.util.*;

public class ItearatorCursor {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(10);
		list.add("shubham");
		list.add(23);

		Iterator i = list.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		System.out.println("******************************************************");

	}

}
