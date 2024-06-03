package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class uniqueSecondChar {
	public static void main(String[] args) {                                     //Find Unique Secound Character
		Scanner sc=new Scanner(System.in);                                     //dadasopandurangbanagar given String
		System.out.println("Enter Your String");
		String s=sc.nextLine();
		int count=0;
		ArrayList<Character>uniqueChar=new ArrayList<>();


		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		System.out.println("sortedString:"+Arrays.toString(ch));


		System.out.println("_________________________________________________________________________________");
		for(int i=0; i<ch.length; i++)                             //Find Unique Character
		{
			count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}


			if(count==1)                                           //Store Unique Character
			{
				uniqueChar.add(ch[i]);
			}
		}
		System.out.println("Unique Characters:"+uniqueChar);
		System.out.println("_________________________________________________________________________________");


		for(int j=0; j<uniqueChar.size(); j++)                       //Find the Second Unique Character
		{
			if(j==1)
			{
				System.out.println("Start Second Unique Character:"+uniqueChar.get(j));
			}
			else if(j==uniqueChar.size()-2)
			{
				System.out.println("End Second Unique Character:"+uniqueChar.get(j));
			}
		}
		System.out.println("_________________________________________________________________________________");
		sc.close();	
	}
}
