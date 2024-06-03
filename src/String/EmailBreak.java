package String;

import java.util.Scanner;

public class EmailBreak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Email");
		String email=sc.nextLine();
		String user="";
		for(int i=0; i<email.length();i++)
		{
			if(email.charAt(i)=='@')
			{   

				break;
			}
			else {
				user=user+email.charAt(i);
			}

		}
		System.out.println(user);
		sc.close();
	}

}
