package controller;

public class polindromNumberPyramid {

	public static void main(String[] args) {
		for(int i=1; i<6; i++)
		{
			for(int j=5-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k>1; k--)
			{
				System.out.print(k);
				
			}
			for(int l=1; l<=i; l++) 
			{
				System.out.print(l);
			}
			
			System.out.println(" ");
		}

	}

}
