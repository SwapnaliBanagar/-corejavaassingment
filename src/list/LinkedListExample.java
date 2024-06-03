package list;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Asha");
		list.add("Rani");
		list.add("Swap");
		list.add("Golu");
		list.add("Sona");
		list.add("Prachi");
		list.add("Sona");
		list.add("Dolly");
		list.add("Riya");
		System.out.println("List = "+list);
		System.out.println("---------------------------------------------------------------");
	
		
		//Iterator
		System.out.println("Iterator");
		ListIterator<String>itr=list.listIterator();	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------------------------");

		
		//Iterator Reverse
		System.out.println("Iterator reverse");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println("---------------------------------------------------------------");

		
		//remove Element
		System.out.println("remove Element");
		list.remove("Golu");
		System.out.println(list);
		System.out.println("---------------------------------------------------------------");

		//remove Element using index
		System.out.println("remove Element Using index");
		System.out.println(list.remove(2));
		System.out.println("---------------------------------------------------------------");
		
		//removeFirst
		System.out.println("removeFirst");
		System.out.println(list.removeFirst());
		System.out.println("---------------------------------------------------------------");

		
		//removeLast
				System.out.println("removeLast");
				System.out.println(list.removeLast()); 
				System.out.println("---------------------------------------------------------------");
	}
	}
	