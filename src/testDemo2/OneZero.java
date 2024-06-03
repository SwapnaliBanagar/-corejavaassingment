package testDemo2;

public class OneZero {

	public static void main(String[] args) {
		for(int i=0; i<=3; i++)
		{

			for(int k=0; k<=i; k++)
			{
				if(k%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
				System.out.println(" ");
			}
		}
}

