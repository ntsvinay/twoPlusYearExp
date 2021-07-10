package array;

import java.util.Scanner;

public class A1 {
	public static void foo()
	{
		 throw  new RuntimeException();
	}
	public static void main(String agr[])

	{
		//foo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row number");

		int r = sc.nextInt();
		System.out.println("enter column number");

		int c = sc.nextInt();
		int[][] arr = new int[r][c];

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
			System.out.println("");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println("");
		}

	}

}
