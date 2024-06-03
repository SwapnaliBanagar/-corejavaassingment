package controller;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Paragraph:");
		String paragraph=sc.nextLine();
		

		String[] sentence=paragraph.split("[.]");

		System.out.println("In that paragraph "+sentence.length+" Sentence are presents");


		String[] words=paragraph.split("[' ',.,]");
		System.out.println("In that paragraph "+words.length+" words are presents");

		
		sc.close();
	}


}


