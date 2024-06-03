package exceptionDemo;

import java.util.Scanner;

public class Votting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();

		if(age>=19)
		{
			System.out.println("You are Eligible For Votting");
		}
		else
		{
			throw new VottingException("You Are Not Eligible For Votting");
			
		}
	}
}
