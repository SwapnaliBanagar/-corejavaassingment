package controller;

import java.util.Scanner;

public class AddOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int add = 0;
		for (int i = 1; i <= number; i++)
		{
			if (i % 2 != 0) {
				add = add + i;
			}
		}
		System.out.println("Sum of Odd numbers From 1 to "+number +" numbers = "+add);
		sc.close();
	}

}
