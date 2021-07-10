package hackerRank;

public class Time12to24 {
	public static void main(String arg[]) {
		System.out.println(new Time12to24().timeConvert("12:05:39AM"));
	}

	public String timeConvert(String s) {
		String rtrn = "";
		String[] ar;
		if (s.contains("PM")) {
			ar = s.split(":");
			if (ar[0].equals("12")) {
				String frst = ar[0];
				frst = "12";
				rtrn = frst + ":" + ar[1] + ":" + ar[2].replace("PM", "");
			} else {
				int first = Integer.parseInt(ar[0]);

				rtrn = first + 12 + ":" + ar[1] + ":" + ar[2].replace("PM", "");
			}
		} else if (s.contains("AM")) {

			ar = s.split(":");
			if (ar[0].equals("12")) {
				String frst = ar[0];
				frst = "00";
				rtrn = frst + ":" + ar[1] + ":" + ar[2].replace("AM", "");
			} else {
				rtrn = s.replace("AM", "");
			}

		}
		System.out.println(rtrn);
		return rtrn;
	}

}
