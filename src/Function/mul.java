package Function;

import java.util.Scanner;

public class mul {
	public static int Mul(int number1, int number2) 
	{
		int mul = number1 * number2;
		return mul;
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Two Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int multification = Mul(number1, number2);
		System.out.println(multification);
	}
}
