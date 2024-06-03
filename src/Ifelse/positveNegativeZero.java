package Ifelse;

import java.util.Scanner;

public class positveNegativeZero {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=scanner.nextInt();
		if (number> 0) {
			System.out.println("Positive Number");
		} else if (number<0)
		{
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}

	}

}
