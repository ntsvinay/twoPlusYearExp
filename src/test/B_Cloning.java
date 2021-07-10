package test;

public class B_Cloning {
	static void show(Object... a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
	}

	public static void main(String arg[]) {
		int day = 1;
		String month = "april";
		int year = 2019;
		show();
		show(day);
		show(day, month);
		show(day, month, year);
		Object datainfo[] = { day, month, year };
		show(datainfo);
	}

}
