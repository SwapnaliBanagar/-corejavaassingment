package interfaceDemo;

import java.util.Scanner;

public class AllBank implements Bank {



	@Override
	public double sbi(){
		double rateOfdoubleres=6.00;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the price: ");
		int price = sc.nextInt();

		System.out.print("Enter the year: ");
		int year = sc.nextInt();

		double total=0;

		total=(rateOfdoubleres*price*year)/100;
		System.out.println("SBI Bank RateOfIntrest = "+total);
		sc.close();
		return total;
	}


	@Override
	public void hdfc() {

		double rateOfdoubleres=7.00;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the price: ");
		int price = sc.nextInt();

		System.out.print("Enter the year: ");
		int year = sc.nextInt();


		double total=0;
		total=(rateOfdoubleres*price*year)/100;
		System.out.println("HDFC Bank RateOfIntrest = "+total);
		sc.close();
	}


	@Override
	public void icici() {
		double rateOfdoubleres=8.00;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the price: ");
		int price = sc.nextInt();

		System.out.print("Enter the year: ");
		int year = sc.nextInt();

		double total=0;
		total=(rateOfdoubleres*price*year)/100;
		System.out.println("ICICI Bank RateOfIntrest = "+total);
		sc.close();
	}


	@Override
	public void axis() {
		double rateOfdoubleres=9.00;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the price: ");
		int price = sc.nextInt();

		System.out.print("Enter the year: ");
		int year = sc.nextInt();


		double total=0;
		total=(rateOfdoubleres*price*year)/100;
		System.out.println("AXIS Bank RateOfIntrest = "+total);
		sc.close();
	}
	
}
