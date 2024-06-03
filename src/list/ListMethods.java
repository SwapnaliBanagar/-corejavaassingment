package list;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println("add Method = "+list);
		//Duplicates Are Allowed in List
		// only Homogeneous Data Are Allowed
		System.out.println("--------------------------------------------------------------------------------------");

		//addAll Method
		List<Integer> list1=new ArrayList<>();
		list1.add(8);
		list1.addAll(list);
		list1.add(4);
		list1.add(1);
		System.out.println("addAll Method = "+list1);
		System.out.println("--------------------------------------------------------------------------------------");


		//get Method
		System.out.println("get Method = "+list1.get(0));
		System.out.println("--------------------------------------------------------------------------------------");

		//remove Method
		System.out.println("remove Method = "+list1.remove(3));
		System.out.println("--------------------------------------------------------------------------------------");

		//object set 
		list1.set(2, 2);
		System.out.println("set method = "+list1);
		System.out.println("--------------------------------------------------------------------------------------");

		//indexOf method
		System.out.println("indexOf = "+list1.indexOf(1));
		System.out.println("--------------------------------------------------------------------------------------");

		//lastIndexOf
		System.out.println("lastIndexOf = "+list1.lastIndexOf(1));
		System.out.println("--------------------------------------------------------------------------------------");

		//iterator
		ListIterator<Integer>iterator=list1.listIterator();
		while(iterator.hasNext())
		{
			System.out.println("Value = "+iterator.next());
		}


	}

}

