package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {

		TreeMap map = new TreeMap();

		map.put("orange", 1);
		map.put("banana", 2);
		map.put("apple", 3);

//		System.out.println(hashmap.get(7));
//		hashmap.remove(5);

		System.out.println(map);
		System.out.println(map.firstKey()); // Output: apple
		System.out.println(map.lastKey()); // Output: orange
		System.out.println(map.tailMap("banana"));

//		System.out.println(hashmap.containsKey(14));

	}

}
