package exceptionDemo;
import java.util.Scanner;
public class PoliString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your String: ");
		String name=sc.nextLine();
		String reversedString="";
		String originalString=name;
		for(int i=name.length()-1; i>=0 ;i--)
		{
			reversedString=reversedString+name.charAt(i);

		}
		System.out.println("ReversedString:"+reversedString);
		if(originalString.equals(reversedString))
		{
			System.out.println("Entered String Is Polindrom");
		}
		else
		{
			throw new PolindromStringException("Entered String Is Not Polindrom");
		}
	}

}
