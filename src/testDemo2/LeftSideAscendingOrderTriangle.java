package testDemo2;

public class LeftSideAscendingOrderTriangle {

	public static void main(String[] args) {
		for(int i=2; i>=0; i--)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=2; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
