package cusors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<>();
		for(int i=1; i<=10; i++)
		{
			number.add(i);
		}
		System.out.println(number);
		System.out.println("---------------------------------------------------------");

		ListIterator <Integer>number2=number.listIterator();
		while(number2.hasNext())
		{
			System.out.println(number2.next());
		}
		System.out.println("---------------------------------------------------------");
		while(number2.hasPrevious())
		{
			System.out.println(number2.previous());
		}

	}

}