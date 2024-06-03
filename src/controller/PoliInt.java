package controller;

public class PoliInt {

	public static void main(String[] args) {
		int number=141;
		int originalnumber=141;
		int reversednumber=0;
		int mod=0;
		for (; number!=0;)
		{
			mod =number%10;
			reversednumber=reversednumber*10+mod;
			number=number/10;
		}
		if(originalnumber==reversednumber)
		{
			System.out.println("This number is Polindrom");
		}
		else
		{
			System.out.println("This number is NOT a Polindrom");
		}
	}

}
