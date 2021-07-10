package hackerEarth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GetAllPrimeNmber {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		for (int i = 3; i <= number - 1; i++) {
			int cond = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					// System.out.println(i + "---" + j);
					cond = cond + 1;

				}
			}
			if (cond == 2) {
				al.add(i);
			}

		}

		for (int a : al) {
			System.out.print(a + "  ");
		}

	}

}
