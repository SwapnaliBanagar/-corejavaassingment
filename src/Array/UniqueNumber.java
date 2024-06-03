package Array;

public class UniqueNumber {

	public static void main(String[] args) {
		int[] number= {1,2,3,8,9,6,5,2,1};
		int count=0;
		for(int i=0; i<number.length; i++)
		{
			count=0;
			for(int j=0; j<number.length;j++)
			{
				if(number[i]==number[j])
				{
					count++;
				}
			}
			if(count==1)
			{

				System.out.print(number[i]+" ");
			}
		}

	}

}
