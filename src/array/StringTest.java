package array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringTest {

	public void abc() {
		/*
		 * int arr[] = { 1, 2, 3, 4, 6, 6 }; HashMap<Integer, Integer> hm = new
		 * HashMap<Integer, Integer>();
		 */

		// String arr[] = { "a", "b", "v", "a", "d","a" };
		String a = "avbcvdf";
		String arr[] = a.split("");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				Integer ac = (Integer) hm.get(arr[i]);
				ac++;
				hm.put(arr[i], ac);
			} else {
				hm.put(arr[i], 1);
			}

		}
		Iterator i = hm.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<Integer, Integer> m = (Map.Entry<Integer, Integer>) i.next();
			System.out.println(m.getKey() + "--" + m.getValue());
		}

		// System.out.println(hm.get(1));
	}

	public String rev(String arv) {
		String arv1 = null;
		char[] aa = arv.toCharArray();
		for (int i = arv.length() - 1; i >= 0; i--) {
			System.out.println(aa[i]);
		}

		return arv1;
	}

	public static void main(String[] args) {
		// new StringTest().abc();
		new StringTest().rev("abcd");
		System.out.println();

	}
}
