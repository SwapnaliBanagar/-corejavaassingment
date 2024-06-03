package controller;

import java.util.Scanner;

public class PositiveNegativeZero {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your 10 Numbers");  
	int number[]=new int[10];
	int countPositive=0;
	int countNegative=0;
	int countZero=0;
	for(int i=0; i<10; i++)
	{
		number[i]=sc.nextInt();
	if(number[i]>0) {
		countPositive++;
	}
	else if(number[i]<0) {
		countNegative++;
	}
	else if(number[i]==0) {
		countZero++;
	}
	}
	System.out.println("Positive Number = "+countPositive);
	System.out.println("Negative Number = "+countNegative);
	System.out.println("Zero Number = "+countZero);
	sc.close();
}  

}
