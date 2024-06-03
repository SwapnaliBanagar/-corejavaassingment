package testDemo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxSecondNumber {

	public static void main(String[] args) {
		List<Integer>number=Arrays.asList(1,2,4,8,9,6,5,12,2,1);
		System.out.println("Original ArrayList:"+number);
		System.out.println("------------------------------------------------------------------");
		
		Collections.sort(number);
		
		System.out.println("Sorted ArrayList:"+number);
		System.out.println("------------------------------------------------------------------");

		System.out.println("MAX Number:"+number.get(number.size()-1));
		System.out.println("------------------------------------------------------------------");

		System.out.println("Second Largest Number:"+number.get(number.size()-2));

	}

}
