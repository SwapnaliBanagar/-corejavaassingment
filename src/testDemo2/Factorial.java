package testDemo2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		int mul=1;
		for(int i=1; i<=number;i++)
		{
			mul=mul*i;
		}
		System.out.println("Factorial of "+number+" is "+mul);
		sc.close();
	}

}
