package Function;

import java.util.Scanner;

public class factorial {
	public static int fact(int number) {
		int mul = 1;
		for (int i = 1; i <= number; i++) {
			mul = mul * i;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int factorial = fact(number);
		System.out.println(factorial);
	}

}
