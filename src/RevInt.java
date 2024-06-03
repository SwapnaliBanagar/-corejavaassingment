import java.util.Scanner;

public class RevInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int originalNumber = number;
		int reversedNumber = 0;
		int mod = 0;
		for (int i = 0; i < number;)
		{
			mod = number % 10;
			reversedNumber = reversedNumber * 10 + mod;
			number = number / 10;
		}
		System.out.println("Original Number = " + originalNumber);
		System.out.println("Reversed Number = " + reversedNumber);
		sc.close();
	}

}
