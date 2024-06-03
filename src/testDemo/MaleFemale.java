package testDemo;

import java.util.Scanner;

public class MaleFemale {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Gender");
		String gender=sc.nextLine();

		if(gender.equalsIgnoreCase(MaleFemaleConstant.MALE))
		{
			System.out.println("You are male");
		}
		else
		{
			System.out.println("You are female");
		}
		sc.close();

	}

}
