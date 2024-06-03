package Ifelse;

import java.util.Scanner;

public class Votting {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
	int age=sc.nextInt();
	if(age>18)
	{
		System.out.println("You Are Eligible for Votting");
	}
	else {
		System.out.println("You Are NOT Eligible for Votting");
	}
	}

}
