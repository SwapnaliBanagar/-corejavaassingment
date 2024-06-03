package controller;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String name=sc.nextLine();
		char[] ch =name.toCharArray();
		Arrays.sort(ch);
		System.out.println("sortedString = "+Arrays.toString(ch));
		System.out.println("______________________________________________________________");
		System.out.print("Duplicate Character:");
		for(int i=0; i<name.length()-1; i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.print(ch[i]+" ");
			}
		}
		sc.close();
	}

}
