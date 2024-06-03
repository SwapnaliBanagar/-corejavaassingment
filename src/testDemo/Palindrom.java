package testDemo;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String name=sc.nextLine();
		String originalString=name;
		String revString="";

		for(int i=name.length()-1;i>=0; i--)
		{
			revString=revString+name.charAt(i);
		}
		
		if(revString.equals(originalString))
		{
			System.out.println(originalString+" String is a palindrom");
		}
		else
		{
			System.out.println(originalString+" String is NOT a palindrom");
		}
		sc.close();
	}
}
