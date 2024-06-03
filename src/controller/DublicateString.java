package controller;

import java.util.Arrays;
import java.util.Scanner;

public class DublicateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String ");
		String name=sc.nextLine();
		int length=name.length();
		char[] ch=name.toCharArray();
		Arrays.sort(ch);
		int count=0;
		System.out.println("Entered String = "+name);
		System.out.println("-----------------------------------------------");
		System.out.println("Length Of Entered String is = "+length);
		System.out.println("-----------------------------------------------");
		System.out.println("sorted string = "+String.valueOf(ch));
		System.out.println("-----------------------------------------------");

		String sorted=String.valueOf(ch);
		for(int i=0; i<sorted.length()-1; i++) {

			for(int j=i+1; j>i; j--) {
				if(ch[i]==ch[j]) {
					System.out.println(String.valueOf("Duplicate Charater = "+sorted.charAt(j)));
					count++;
				}
			}
		}
		System.out.println("-----------------------------------------------");

		System.out.println("Total Duplicate Character Count = "+count);
		sc.close();
		
	}
}







