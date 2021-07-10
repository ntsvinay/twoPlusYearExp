package array;

public class SortArray {
	public static void main(String[] args) {

		int[] ar = { 12, 23, 1, 2, 34, 21, 12, 2, 21 };

		for (int i = 1; i <= ar.length - 1; i++) {
			// int temp = 0;

			if (ar[i] < ar[i - 1]) {
				ar[i] = ar[i] + ar[i - 1];
				ar[i - 1] = ar[i] - ar[i - 1];
				ar[i] = ar[i] - ar[i - 1];
				i = 0;

			}

			/*
			 * for (int j = i; j <= ar.length - 1; j++) { int temp = 0; if (ar[i] > ar[j]) {
			 * temp = ar[i]; ar[i] = ar[j]; ar[j] = temp;
			 * 
			 * } }
			 */

		}
		for (int a : ar) {
			System.out.println(a);
		}
	}
}
