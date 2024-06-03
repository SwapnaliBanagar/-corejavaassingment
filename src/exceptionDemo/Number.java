package exceptionDemo;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int number1=sc.nextInt();
		System.out.println("Enter your second number: ");
		int number2=sc.nextInt();
		int div=0;
		try
		{
			div=number1/number2;	
			System.out.println(div);
		}
		catch(Exception e)
		{
			System.out.println("dividing by 0 is not possible");
		}
		
		sc.close();	
		System.out.println("Code End");
	}
}
