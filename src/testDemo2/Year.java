package testDemo2;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Year");
		int year=sc.nextInt();
		
		if(year==2024)
		{
			System.out.println("2024 this is a current year");
		}
		else
		{
			System.out.println(year+" this is NOT a current year");
		}
		sc.close();

	}

}
