package controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MINMAX {
	public static void main(String []args) {
		List<Integer>list=Arrays.asList(4,3,2,2,4);
		int size=list.size();
		
		System.out.println("Original Array List = "+list);
		System.out.println("Total Original Array List Count = "+size);
		System.out.println("---------------------------------------------------------------------------------------------");
		Collections.sort(list);
		System.out.println("Ascending Order Array List = "+list);
		System.out.println("Total Ascending Order Array List Count = "+size);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("MIN Number = "+list.get(0));
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("MAX Number = "+list.get(size-1));
		System.out.println("---------------------------------------------------------------------------------------------");
	}
}

