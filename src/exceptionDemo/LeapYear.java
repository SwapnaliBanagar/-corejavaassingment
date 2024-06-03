package exceptionDemo;

import java.util.Scanner;

public class LeapYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println(year+" Leap Year");
		}
		else
		{
			throw new LeapYearException("This Is Not a Leap Year");
		}
		sc.close();
	}

}
