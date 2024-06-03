package testDemo2;

public class PalindromNumber {

	public static void main(String[] args) {
		int number=0;

		int revNumber=0;
		int mod=0;
		for(int i=1; i<=100; i++)
		{
			number=i;
			int originalNumber=number;
			mod=0;
			revNumber=0;
			while(number!=0)
			{
				mod=number%10;
				revNumber=revNumber*10+mod;
				number/=10;
			}
			//System.out.println(revNumber);
			if(originalNumber==revNumber)
			{
				System.out.println(originalNumber);
			}


		}

	}

}
