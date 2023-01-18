package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {

		Map hashmap = new HashMap();

		hashmap.put(1, "shubham");
		hashmap.put(2, "akash");
		hashmap.put(3, "mahesh");
		hashmap.put(4, "akshay");
		hashmap.put(6, "anant");
		hashmap.put(7, "rushikesh");
		hashmap.put(8, "");

		System.out.println(hashmap.get(7));
		hashmap.remove(5);

		System.out.println(hashmap);
		
		
		System.out.println(hashmap.containsKey(14));

	}

}
