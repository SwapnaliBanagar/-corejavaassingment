package controller;
import java.util.Scanner;
public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your String");
		String name=sc.nextLine();
		String reversedName="";			
		for(int i=name.length()-1; i>=0; i--)
		{
			reversedName=reversedName+name.charAt(i);
		}
		System.out.println(reversedName);
		sc.close();
	}

}
