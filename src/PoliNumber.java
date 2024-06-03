import java.util.Scanner;

public class PoliNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int reversedNumber = 0;
		int originalNumber = number;
		int mod = 0;
		for (int i = 1; i <= number;) {
			mod = number % 10;
			reversedNumber = reversedNumber * 10 + mod;
			number = number / 10;
		}
		System.out.println(reversedNumber);

		if (reversedNumber == originalNumber) {
			System.out.println("This Number is Polindrom");
			System.out.println("Original Number = " + originalNumber);
			System.out.println("Reversed Number = " + reversedNumber);
		} else {
			System.out.println("This Number is NOT a Polindrom");
		}
		sc.close();
	}

}
