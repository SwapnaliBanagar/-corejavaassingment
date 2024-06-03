package Function;

import java.util.Scanner;

public class Circle {
	public static int radius(int number)
	{
		int circumference=2*number;
		return circumference;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Radius");
		int number=sc.nextInt();
		int radius=radius(number);
		System.out.println("Circumference Of a circle = "+radius+"π");
		sc.close();
	}
	
}
