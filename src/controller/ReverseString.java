package controller;

public class ReverseString {

	public static void main(String[] args) {

		String name="Swapnali";
		String reversedname="";
		int length=name.length();

		for (int i=length-1; i>=0; i--)
		{
			reversedname=reversedname+name.charAt(i);
		}
		System.out.println("Reversed name ="+reversedname+   "   Originalname= "+name);
	}

}
