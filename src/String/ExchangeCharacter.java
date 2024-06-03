package String;

import java.util.Scanner;

public class ExchangeCharacter {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your String");
		String name=sc.nextLine();
		int length=name.length();
		String result="";
		for(int i=0; i<length; i++)
		{
			if(name.charAt(i)=='e')
			{					
				result=result+'i';
			}
			else
			{ 
				result=result+name.charAt(i);
			}
		}
		System.out.println(result);
		sc.close();
	}
}
