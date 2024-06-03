package controller;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {4,8,2,7,8,9,2,2,8};
		int length=a.length;
		System.out.println("Original Array = "+Arrays.toString(a));
		System.out.println("-------------------------------------------------");
		
		Arrays.sort(a);
		

		System.out.println("Sorted Array = "+Arrays.toString(a));
		System.out.println("-------------------------------------------------");
		System.out.println("Min number = "+a[0]);
		System.out.println("-------------------------------------------------");
		System.out.println("Max Number = "+a[length-1]);
		for(int i=0; i<length-1; i++)
		{
			for(int j=i; j<=i; j++)
			{
				if(a[i]==a[i+1])
				{
					System.out.println("Duplicate number = "+a[i]);
				}
			}
		}

	}
}
