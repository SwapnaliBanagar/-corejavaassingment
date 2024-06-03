
public class DiamondPattern {

	public static void main(String[] args) {
		     
		for (int i=0; i<5; i++)   
		{  
			for (int j=5-i; j>1; j--)   
			{  
				System.out.print(" ");   
			}   
			for (int k=0; k<=i; k++ )   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
		
		
		for (int l=4; l>0; l--)   
		{  
			for (int m=l-4; m<=0; m++)   
			{  
				System.out.print(" ");   
			}   
			for (int n=0; n<l; n++ )   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}
}



