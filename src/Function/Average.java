package Function;

import java.util.Scanner;
public class Average {
	public static int Average(int number1,int number2,int number3)
	{
		int sum=number1+number2+number3;
		int average=sum/3;
		return average;

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Three Numbers");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		int Average=Average(number1,number2,number3);
		System.out.println("Average Of Given Three Numbers is = "+Average);
	}
}
