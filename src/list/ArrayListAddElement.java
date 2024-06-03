package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class ArrayListAddElement {
	public static void main(String args[])
	{
		System.out.println("add Element in ArrayList");
		ArrayList<String>list=new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list);
		System.out.println("--------------------------------------------------------------------------------------------");


		///Iterating ArrayList using Iterator

		System.out.println("Iterating ArrayList using Iterator");
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------------------------------------------------------------");


		//Iterating ArrayList using For-each loop

		System.out.println("Iterating ArrayList using For-each loop");

		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("--------------------------------------------------------------------------------------------");




		//Get ArrayList;

		System.out.println("Get ArrayList");
		System.out.println("Get Element= "+list.get(3));
		System.out.println("--------------------------------------------------------------------------------------------");

		//Set ArrayList;

		System.out.println("Set ArrayList");
		list.set(2, "Grapes");
		System.out.println("Set Element = "+list);
		//for-each Loop
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------------------------------------------------------------");


		//How to Sort ArrayList

		System.out.println("Sorting Array");
		Collections.sort(list);
		System.out.println("Sorted List = "+list);
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("--------------------------------------------------------------------------------------------");


		//Iterating Collection Reverse

		System.out.println("Iterating Collection through remaining ways");
		ListIterator<String>list2=list.listIterator(list.size());
		while(list2.hasPrevious())
		{
			System.out.println(list2.previous());
		}


	}
}
