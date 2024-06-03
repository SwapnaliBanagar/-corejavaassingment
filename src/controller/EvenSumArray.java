package controller;

import java.util.Arrays;
import java.util.List;

public class EvenSumArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int sum = 0;
		int even = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i) % 2 == 0) {
				even = list.get(i);
				sum = sum + even;
			}
		}
		System.out.println("Sum Of Even Number = " + sum);
	}
}
