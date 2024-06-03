package Array;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		int sortedList=0;
		List<Integer>list=Arrays.asList(1,5,6,8,3,2);
		for(int i=0; i<list.size()-1;i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i)>list.get(j))
				{
					sortedList=list.get(i);
					list.set(i, list.get(j));
					list.set(j, sortedList);
				}
			}
		}
			System.out.println(list);
		

	}
	
}



























