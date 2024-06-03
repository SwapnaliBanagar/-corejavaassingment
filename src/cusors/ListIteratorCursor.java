package cusors;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class ListIteratorCursor {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Swap");
		s.add("Dadaso");
		s.add("Banagar");
		s.add("Swapnali");
		System.out.println(s);
		System.out.println("----------------------------------------------");

		ListIterator<String> l=s.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("----------------------------------------------");
		
		ListIterator<String> l2=s.listIterator(s.size());
		while(l2.hasPrevious()) {
			System.out.println(l2.previous());
		}

	}

}
