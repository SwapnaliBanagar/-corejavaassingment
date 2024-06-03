package Array;

import java.util.Arrays;


public class AscendingOrder {

	public static void main(String[] args) {
		int number[] = { 2, 4, 3, 7, 9, 10 };
		int length = number.length;
		boolean isAscending = true;
		for (int i = 0; i < length - 1; i++) 
		{
			if (number[i] > number[i + 1]) 
			{
				isAscending = false;
			}
		}
		if (isAscending)
		{
			System.out.println(Arrays.toString(number) + " is sorted in ascending order");
		} else {
			System.out.println(Arrays.toString(number) + " is NOT sorted in ascending order");

		}
		
	}

}
