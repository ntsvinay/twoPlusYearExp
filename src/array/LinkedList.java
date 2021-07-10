package array;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(l);
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(0);
		System.out.println(abc(l));

	}

	public static boolean abc(List<Integer> av) {

		for (int i = 0; i < av.size(); i++) {
			int value = av.get(i);
			av.remove(i);
			if (av.contains(value)) {

				return true;
			}
		}
		return false;

	}

}
