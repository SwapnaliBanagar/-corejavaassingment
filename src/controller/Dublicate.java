package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dublicate {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 3, 3, 2, 3, 3,2,1,2,1,2,1,2,1,3);
		List<Integer> duplicate = new ArrayList<>();
		int count = 0;

		System.out.println("Original List = " + list);
		System.out.println("------------------------------------------------------------------");
		Collections.sort(list);
		System.out.println("sorted list = " + list);
		System.out.println("------------------------------------------------------------------");

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j > i; j--) {

				if (list.get(i) == list.get(j)) {
					duplicate.add(list.get(i));
					count++;
				}
			}
		}
		System.out.println(duplicate);
		System.out.println("Duplicate Number Count = " + count);
	}
}
