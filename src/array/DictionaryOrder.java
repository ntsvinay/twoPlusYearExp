package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DictionaryOrder {
	public static void main(String[] args) {
		int[] intArr = { 1, 42, 10, 100 };

		List<String> intLst = new ArrayList<String>();
		for (int i = 0; i < intArr.length; i++) {
			intLst.add(String.valueOf(intArr[i]));
		}
		String[] strArr = { "aaa", "bb", "ab", "ac" };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].compareTo(strArr[j]) > 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		Object[] a = Stream.of(strArr).sorted(String::compareTo).toArray();
		Object[] a2 = intLst.stream().sorted(String::compareTo).toArray();
		Object[] a1 = Stream.of(intArr).parallel().sorted().toArray();
		for (String str : strArr) {
			System.out.println(str);
		}
		System.out.println("dictonar order");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]);
		}
		System.out.println();
		System.out.println("sorted order of an array");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

	}
}
