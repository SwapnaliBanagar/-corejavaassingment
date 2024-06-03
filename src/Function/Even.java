package Function;

import java.util.Scanner;

public class Even {
public static int even(int number)
{
	if(number%2==0) {
		System.out.println(number+" is a Even Number");
	}
	else
	{
		System.out.println(number+" is NOT a Even Number");
	}
	return number;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number=sc.nextInt();
		int even=even(number);
	}
}
