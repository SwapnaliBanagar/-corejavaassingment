package exceptionDemo;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Your Age");
		int age =sc.nextInt();

		if(age>=1)
		{
			System.out.println("Valid Age.... You are "+age +" Year Old");
		}
		else
		{
			throw new AgeException("Invalid Age....  Age in only positive Number");
		}
	}

}
