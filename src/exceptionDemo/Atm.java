package exceptionDemo;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pin");
		int pin=sc.nextInt();
		int count=0;
		while(pin!=0)
		{
			pin/=10;
			count++;
		}
		if(count==4)
		{
			System.out.println("Welcome To ATM");

		}

		else
		{
			throw new AtmException("Please Enter Valid Pin");

		}
		sc.close();
	}

}
