package testDemo2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		int size=number;
		int count=0;
		int lastNumber=0;
		int originalNumber=number;
		int sum=0;
		while(size!=0)
		{
			size/=10;
			count++;
		}
		//System.out.println(count);

		while(number!=0)
		{
			lastNumber=number%10;
			sum+=Math.pow(lastNumber, count);
			number/=10;
		}
		if(sum==originalNumber)
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
