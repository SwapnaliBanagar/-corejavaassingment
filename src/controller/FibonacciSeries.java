package controller;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Two Numbers");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=0;
		System.out.print(number1+" ");
		System.out.print(number2+" ");
		for(int i=0; i<=10;i++)
		{			
			number3=number1+number2;
			number1=number2;
			number2=number3;
			System.out.print(number3+" ");
		}
		sc.close();
	}
	
}
