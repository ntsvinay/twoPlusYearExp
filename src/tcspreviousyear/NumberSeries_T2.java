package tcspreviousyear;
//series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187.............

//Write a program to find the Nth term in the series.
///You can assume that N will not exceed 30.

public class NumberSeries_T2 {
	public static void main(String[] args) {
		int e = 1, o = 1, n = 30;
		int a, b, ia = 2, ib = 3;
		for (int i = 1; i < 30; i = i + 2) {

			System.out.println(i + "--" + e + " " + o + " ");
			e = e * ia;
			o = o * ib;
		}
		System.out.println("\n");
		System.out.println("30 number of series is:--" + e);

	}

}
