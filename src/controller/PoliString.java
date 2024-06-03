package controller;

public class PoliString {

	public static void main(String[] args) {
		String name="nayan";
		String reversedname="";
		int length=name.length();


		for(int i=length-1; i>=0; i--)
		{
			reversedname=reversedname+name.charAt(i);

		}
		if(name.equals(reversedname))
		{
			System.out.println("This String is Polindrom");
		}
		else
		{
			System.out.println("This String is NOT a Polindrom");
		}
	}



}
