package Function;

import java.util.Scanner;

public class primeNumber {
	public static int prime(int number) 
	{
		int count = 0;
		for (int i = 1; i <= number; i++) 
		{
			count = 0;
			for (int j = 1; j <= i; j++) 
			{
				if (i % j == 0)
					count++;
			}
		}
		if (count == 2)
		{
			System.out.println(number + " is a Prime Number");
		} else {
			System.out.println(number + " is NOT a Prime Number");
		}
		return number;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int primeNumber = prime(number);
	}
}
