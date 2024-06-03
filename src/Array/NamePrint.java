package Array;

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		int size = sc.nextInt();
		String name[] = new String[size];

		for (int i = 0; i < size; i++) 
		{
			name[i] = sc.nextLine();
		}
		for (int i = 0; i < name.length; i++) 
		{
			System.out.println("name " + (i + 1) + " is : " + name[i]);
			sc.close();
		}
	}

}
