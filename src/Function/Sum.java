package Function;

import java.util.Scanner;

public class Sum {

	public static int Calculatesum(int number1, int number2)
	{
		int sum = number1 + number2;
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your two Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int add = Calculatesum(number1, number2);
		System.out.println("Sum of Two Numbers = " + add);
	}

}
