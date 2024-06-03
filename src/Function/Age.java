package Function;

import java.util.Scanner;

public class Age {
	public static int age(int number) {
		if (number > 18)
		{
			System.out.println("You are Eligible For Votting");
		} else {
			System.out.println("You are NOT Eligible For Votting");
		}
		return number;
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int number = sc.nextInt();
		int vote = age(number);
	}
}
