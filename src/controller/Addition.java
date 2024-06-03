package controller;

public class Addition {

	public static void main(String[] args) {
		int number = 12345;
		int mod = 0;
		int reversed = 0;
		int originalNumber=number;
		while (number > 0)
		{
			mod = number % 10;
			reversed = reversed*10 + mod;
			number = number / 10;

		}
		System.out.println(reversed);
		if(originalNumber==number) {
			System.out.println("This is a Polindrom Number");
		}
		else {
			System.out.println("This is NOT a Polindrom Number");
		}
	}

}
