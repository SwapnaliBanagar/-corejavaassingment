package controller;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Month Number");
		int number = sc.nextInt();
		switch (number) {
		case 1: {
			System.out.println("1 Number Month is January");
			break;
		}
		case 2: {
			System.out.println("2 Number Month is February");
			break;
		}
		case 3: {
			System.out.println("3 Number Month is March");
			break;
		}
		case 4: {
			System.out.println("4 Number Month is April");
			break;
		}
		case 5: {
			System.out.println("5 Number Month is May");
			break;
		}
		case 6: {
			System.out.println("6 Number Month is June");
			break;
		}
		case 7: {
			System.out.println("7 Number Month is July");
			break;
		}
		case 8: {
			System.out.println("8 Number Month is August");
			break;
		}
		case 9: {
			System.out.println("9 Number Month is September");
			break;

		}
		case 10: {
			System.out.println("10 Number Month is October");
			break;

		}
		case 11: {
			System.out.println("11 Number Month is November");
			break;

		}
		case 12: {
			System.out.println("12 Number Month is December");
			break;
		}
		default: {
			System.out.println("Invalid Month Number");
		}
		sc.close();
		}

	}

}
