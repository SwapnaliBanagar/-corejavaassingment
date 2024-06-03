package controller;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SecondLargestNumber {
	public static void main(String args[])
	{
		List<Integer> list=Arrays.asList(45,12,46,15,24,75,31,89);

		Collections.sort(list);
		System.out.println(list);
		int length=list.size();
		System.out.println("Second Largest Number = "+list.get(length-2));

	}
}
