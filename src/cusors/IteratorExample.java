package cusors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<Integer>l =new ArrayList<>();
		for(int i=1; i<=10; i++)
		{
			l.add(i);
		}
		System.out.println(l);

		//Iterator is applicable for any Collection it is universal Cursor
		//Duplicates allowed, insertion order preserved
		// read,remove
		System.out.println("-------------------------------------");
		System.out.println("--------Using Iterator----------------");
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			Integer n=(Integer) itr.next();
			if(n%2==0)
			{
				System.out.println(n);
				itr.remove();
			}

		}
		System.out.println(l);
	}

}
