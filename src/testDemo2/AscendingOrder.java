package testDemo2;

import java.util.Arrays;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,8,3,5,20,2);
		System.out.println("OriginalArrayList:"+list);
		System.out.println("----------------------------------");


		for(int i=0; i<list.size(); i++)
		{
			for(int j=i; j<list.size()-1;j++)
			{
				if(list.get(i)>list.get(j+1))
				{
					int temp=list.get(i);
					list.set(i, list.get(j+1));
					list.set((j+1), temp);
				}
				
			}
		}
		System.out.println("SortedList:"+list);
	}

}
