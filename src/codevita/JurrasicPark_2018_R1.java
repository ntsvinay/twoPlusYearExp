package codevita;

import java.util.Scanner;

public class JurrasicPark_2018_R1 {
	public static void main(String arg[]) {
		int c_r, c_c, lst_r, lst_c, prvus_r, prvus_c;
		int g_count = 0, total_g = 0;
		int[] arr1 = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int r = sc.nextInt();
		System.out.println("Enter the column");
		int c = sc.nextInt();
		String[][] arr = new String[r][c];
		System.out.println("enter the element of gate");
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = sc.nextInt();

		}
		for (int i = 0; i < arr1.length; i++) {

			System.out.print(arr1[i]);
		}
		c_r = arr1[arr1.length - 2];
		c_c = arr1[arr1.length - 1];
		System.out.println("Enter charcter");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				String value = sc.next();
				if (value.equals("g")) {
					g_count++;
				}
				arr[i][j] = value;
			}
		}
		lst_c = (arr[c_r].length - 1);
		lst_r = (arr.length - 1);
		prvus_c = lst_c - c_c;
		System.out.println(lst_c + "," + lst_r + "," + prvus_c);

		System.out.println("number of g:--" + g_count);
		total_g = g_count;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}

		if (c_c == lst_c) {
			if (c_r == 0 && lst_r == 0) {
				if (arr[c_r][c_c - 1].equals("g")) {
					g_count--;

				}
				if (arr[c_r + 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c - 1].equals("g")) {
					g_count--;
				}

			} else if (c_r == lst_r) {

				if (arr[c_r][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c - 1].equals("g")) {
					g_count--;
				}

			} else {
				if (arr[c_r][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c - 1].equals("g")) {
					g_count--;
				}

			}

		}

		else if (c_c == 0 && lst_c == 0) {
			if (c_r == 0 && lst_r == 0) {
				if (arr[c_r + 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r][c_c + 1].equals("g")) {
					g_count--;
				}

			} else if (c_r == lst_c) {

				if (arr[c_r][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c].equals("g")) {
					g_count--;
				}

			} else {

				if (arr[c_r + 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c + 1].equals("g")) {
					g_count--;
				}
			}

		}

		else if (c_c != 0 && c_c < lst_c) {

			// here check
			if (c_r == 0 && lst_r == 0) {
				if (arr[c_r][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r][c_c - 1].equals("g")) {
					g_count--;
				}

				if (arr[c_r + 1][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c + 1].equals("g")) {
					g_count--;

				}
			} else if (c_r == lst_c) {

				if (arr[c_r][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r][c_c - 1].equals("g")) {
					g_count--;
				}

				if (arr[c_r - 1][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c + 1].equals("g")) {
					g_count--;

				}
			} else {
				if (arr[c_r][c_c + 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r][c_c - 1].equals("g")) {
					g_count--;
				}

				if (arr[c_r - 1][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r - 1][c_c + 1].equals("g")) {
					g_count--;

				}
				if (arr[c_r + 1][c_c - 1].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c].equals("g")) {
					g_count--;
				}
				if (arr[c_r + 1][c_c + 1].equals("g")) {
					g_count--;

				}

			}

		}
		double f_val = (g_count * 100) / total_g;
		System.out.println("now count of g--" + g_count + "\n" + f_val);

	}

}
