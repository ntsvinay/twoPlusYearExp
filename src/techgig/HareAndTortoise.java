package techgig;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HareAndTortoise {
	public static void main(String arg[]) {
		int numberOfRoad;
		int margin = 0;
		// ArrayList<String,Integer> ls = new ArrayList<String,Integer>();
		Map ls = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int hills = sc.nextInt();
		int forest = sc.nextInt();
		int[][] mt = new int[forest][hills];
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				mt[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				System.out.print(mt[i][j] + "  ");

			}
			System.out.println("");
		}
		for (int i = 0; i < mt.length - 1; i++) {
			numberOfRoad = 0;
			int row = mt[i][0];
			for (int j =i; j < mt.length; j++) {
				int column = mt[j][1];
				numberOfRoad++;
				if (row == column) {
					break;
				}
				
				
			}
			ls.put(row, numberOfRoad);

		}
		Comparable min=Collections.min(ls.values());
		System.out.println("hbhj:-"+min);
		
	}

}
