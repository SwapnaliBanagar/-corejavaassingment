package Function;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Two Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int findPower = findPower(number1, number2);
		System.out.println(findPower);
		sc.close();
	}
	public static int findPower(int number1, int number2) {
		int power=1;
		for (; number2 != 0; ) {
			power *= number1;
			number2--;
		}
		return power;
	}
}
