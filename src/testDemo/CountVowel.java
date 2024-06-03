package testDemo;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String name=sc.nextLine();
		int countVowel=0;
		int countConconent=0;
		for(int i=0; i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				countVowel++;
			}
						
			else
			{
				countConconent++;
			}
		}
		System.out.println("Total Vowel:"+countVowel +"  Total Conconent:"+countConconent);
		sc.close();
	}

}
