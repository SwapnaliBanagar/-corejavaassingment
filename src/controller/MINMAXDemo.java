package controller;

import java.util.Arrays;

public class MINMAXDemo {

	public static void main(String[] args) {
		int number[] = {4,2,3,7,9,10};
		int length=number.length;
		Arrays.sort(number);
		System.out.println("SortedArrayList"+Arrays.toString(number));
		System.out.println("MIN Number = "+number[0]);
		System.out.println("MAX Number = "+number[length-1]);
	}

}
