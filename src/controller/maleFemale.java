package controller;

import java.util.Scanner;

public class maleFemale {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Gender");
		String gender=sc.nextLine();
		if(gender.equalsIgnoreCase(MaleFemaleConstant.MALE))
		{
			System.out.println("This Person is Male ");
		}
		else
		{
			System.out.println("This Person is Female ");	
		}
		sc.close();
	}

}
