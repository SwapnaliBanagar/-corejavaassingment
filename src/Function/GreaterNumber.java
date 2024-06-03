package Function;

import java.util.Scanner;

public class GreaterNumber {
	public static int findGreaterNumber(int number1, int number2) {
		if (number1 > number2)
		{
			return number1;

		} else
		{   
			return number2;

		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Two Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int greaterNumber = findGreaterNumber(number1, number2);
		System.out.println("Greater Number = " + greaterNumber);

		sc.close();
	}
}
