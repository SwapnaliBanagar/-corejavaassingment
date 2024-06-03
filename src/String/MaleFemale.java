package String;

import java.util.Arrays;
import java.util.List;

public class MaleFemale {
	public static void main(String args[] ){

		List<String> gender=Arrays.asList("male","other","female","male","other","female","male","other","male") ;
		gender.size();
		int maleCount=0;
		int femaleCount=0;
		int otherCount=0;
		for(int i=0; i<gender.size();i++)
		{
			if(gender.get(i).equalsIgnoreCase("Male"))
			{
				maleCount++;
			}
			if(gender.get(i).equalsIgnoreCase("female"))
			{
				femaleCount++;
			}
			if(gender.get(i).equalsIgnoreCase("other"))
			{
				otherCount++;
			}
		}
		System.out.println(" Male = "+maleCount  +";  Female = "+femaleCount +";  Other = "+otherCount);
	}
}
