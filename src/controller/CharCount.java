package controller;

public class CharCount {

	public static void main(String[] args) {
		String s="Swapnali dadaso Banagar";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ') 
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
