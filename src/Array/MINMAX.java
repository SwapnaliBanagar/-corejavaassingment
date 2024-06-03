package Array;

import java.util.Arrays;

public class MINMAX {
	public static void main(String args[]){
		int number[]= {1,3,2,5,6,7,3};
		int length=number.length;
		System.out.println("Original Array = "+Arrays.toString(number));
		System.out.println("----------------------------------------------------------------");
		
		Arrays.sort(number);
		
		System.out.println("Sorted Array = "+Arrays.toString(number));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Min Number = "+number[0]);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Max Number = "+number[length-1]);


	}
}