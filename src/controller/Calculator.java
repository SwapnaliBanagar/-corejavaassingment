package controller;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Two Numbers");
			int number1=sc.nextInt();
			int number2=sc.nextInt();
			int addition=number1+number2;
			System.out.println("Addition Of Two Numbers = "+addition);
			int sub=number1-number2;
			System.out.println("Substration Of Two Number = "+sub);
			int mul=number1*number2;
			System.out.println("Multification Of Two Number = "+mul);
			try
			{
				int div=number1/number2;
				System.out.println("Division Of Two Number = "+div);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				int mod=number1%number2;
				System.out.println("Modulo Of Two Number = "+mod);
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	


		/*if(number2!=0) {
		int div=number1/0;
		System.out.println("Division Of Two Number = "+div);
		}
		else
		{
			System.out.println("Divided Number is Zero");
		}

		if(number2!=0) {
		int mod=number1%number2;
		System.out.println("Modulo Of Two Number = "+mod);
		}
		else {
			System.out.println("Invalid");
		}*/
	}
}
