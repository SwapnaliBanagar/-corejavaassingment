package String;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String name=sc.next();
		char[] ch=name.toCharArray();
		Arrays.sort(ch);
		int count=0;

		System.out.print("Duplicate Character:");
		for(int i=0; i<name.length()-1; i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.print(ch[i]+" ");
				count++;
			}
		}
		System.out.println("\nDuplicate Character Count:"+count);
		sc.close();
	}
}
