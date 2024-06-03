package controller;

public class Sumof1to10 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<=10; i++)
		{
			sum=sum+i;
			System.out.println(sum+i);
		}
		System.out.println("Sum of first 10 number = "+sum);
	}

}
