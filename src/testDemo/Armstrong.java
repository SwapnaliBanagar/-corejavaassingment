package testDemo;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		int size=number;
		int count=0;
		int lastNumber=0;
		int sum=0;
		int originalNumber=number;

		while(size!=0)
		{
			size=size/10;
			count++;
		}

		while(number!=0)
		{
			lastNumber=number%10;
			sum+=Math.pow(lastNumber, count);
			number/=10;
		}
		if(originalNumber==sum)
		{
			System.out.println(originalNumber+" is a Armstrong Number");
		}
		else
		{
			System.out.println(originalNumber+" is NOT a Armstrong Number");

		}
		sc.close();

	}

}
