package testDemo2;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			if(i%2!=0)
			{
			for(int j=5-i; j>0; j-- )
			{
				System.out.print(" ");
			}
			}
			for(int k=0; k<i; k++)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}
			}
			if(i%2!=0)
			{
			System.out.println("");
			}
		}
	}

}
