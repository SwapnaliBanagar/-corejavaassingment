package controller;

public class Reversedint {

	public static void main(String[] args) {
		int number=123;
		int reversednumber=0;
		int mod=0;
		for(; number!=0; )
		{
			mod=number%10;
			reversednumber=reversednumber*10+mod;
			number=number/10;
		}

		System.out.println(+reversednumber);
	}

}
