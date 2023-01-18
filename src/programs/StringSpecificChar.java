package programs;

import java.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class StringSpecificChar {

	private static void RemoveduplicateIntegerValue() {

		int a[] = { 10, 10, 20, 30, 423, 234, 34 };

		int[] uniqueArray = Arrays.stream(a).distinct().toArray();

		for (int i : uniqueArray) {

			System.out.println(i);
		}

	}

	private static void ReverseString(String str) {

		String emptyString = "";

		for (int i = 0; i < str.length(); i++) {

			char a = str.charAt(i);
			emptyString = a + emptyString;
		}
		System.out.println(emptyString);
	}

	public static void main(String[] args) {

//	RemoveduplicateIntegerValue();
		ReverseString("shubhamshedge");

	}

}
