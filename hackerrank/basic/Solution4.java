//Sample Input
//
//2
//0 2 10
//5 3 5
//Sample Output
//
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98

package basic;

import java.util.*;
import java.io.*;

public class Solution4 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int sum = a;
			for (int j = 0; j < n; j++) {
				int nextEle = (int) Math.pow(2, j) * b;
				sum = sum + nextEle;
				System.out.printf("%s ", sum);
			}
			if (i < t - 1) {
				System.out.print("\n");
			}

		}
		in.close();
	}
}
