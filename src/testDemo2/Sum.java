package testDemo2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		int sum=0;
		int lastNumber=0;
		while(number!=0)
		{
			lastNumber=number%10;
			sum=sum+lastNumber;
			number/=10;
		}
		System.out.println("Total sum of number:"+sum);
		sc.close();
	}

}
