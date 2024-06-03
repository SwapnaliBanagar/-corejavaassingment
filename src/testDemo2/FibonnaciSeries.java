package testDemo2;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Your Second Number");
		int num2=sc.nextInt();
		int num3=0;

		System.out.print("FibonnaciSeries:"+num1+" "+num2+" ");
		for(int i=1; i<=10; i++)
		{
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
		sc.close();
	}

}
