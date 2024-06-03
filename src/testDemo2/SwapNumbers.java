package testDemo2;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your numbers");
		System.out.print("A= ");
		int a=sc.nextInt();
		System.out.print("B= ");
		int b=sc.nextInt();

		System.out.println("original Numbers:"+"a="+a+","+"b="+b);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Swap Numbers:"+"b="+b+","+"a="+a);
		sc.close();
	}
}
