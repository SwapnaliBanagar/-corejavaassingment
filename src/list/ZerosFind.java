package list;

import java.util.Arrays;
import java.util.List;

public class ZerosFind {

	//INPUT	list(2,0,9,8,3,0,5,1,0)
	//OUTPUT(2,9,8,3,5,1,0,0,0)


	public static void main(String[] args) {

		List<Integer>numbers=Arrays.asList(2,0,9,8,3,0,5,1,0);

		int temp=0;
		for(int i=0; i<numbers.size(); i++)
		{
			for(int j=i+1; j<numbers.size(); j++)
			{
				if(numbers.get(i)==0)
				{
					temp=numbers.get(i);
					numbers.set(i, numbers.get(j));
					numbers.set(j, temp);
				}
			}
		}
		System.out.println(numbers);
	}

}


