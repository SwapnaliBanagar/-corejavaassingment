package list;
import java.util.Set;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.NavigableSet;
public class SetExample {

	public static void main(String[] args) {
		Set <Integer> list = new HashSet<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		System.out.println(list);

		Set<String>name=new HashSet<>();
		name.add("Abc");
		name.add("Gauri");
		name.add("Sonu");
		name.add("Sonu");
		name.add("Swapnali");
		name.add("Sonu");
		name.add("Ab");
		System.out.println(name);
		System.out.println("-----------------------------------------------------");

		// IN Set Duplicates Are Not Allowed
		// Insertion Order is not preserved(Automatic Sorted)


		//Sorting Data Using SortedSet
		SortedSet <Integer> sortList = new TreeSet<Integer>();
		sortList.add(1);
		sortList.add(2);
		sortList.add(5);
		sortList.add(1);
		sortList.add(3);
		System.out.println("Sort int = "+sortList);

		//Sorting String
		SortedSet <String> sortName = new TreeSet<>();
		sortName.add("Abc");
		sortName.add("Gauri");
		sortName.add("Sonu");
		sortName.add("Sonu");
		sortName.add("Swapnali");
		sortName.add("Sonu");
		sortName.add("Ab");
		System.out.println("Sort String = "+sortName);
		System.out.println("-----------------------------------------------------");


		//NavigableSet Ascending Descending Order

		NavigableSet<Integer>navi=new TreeSet<>();
		navi.add(1);
		navi.add(2);
		navi.add(5);
		navi.add(1);
		navi.add(3);
		System.out.println("Navigable Set Integer = "+navi);
		System.out.println("Navigable Set Descending Order = "+navi.descendingSet());
		System.out.println("------------------");


		NavigableSet<String>ns=new TreeSet<>();
		ns.add("Abc");
		ns.add("Gauri");
		ns.add("Sonu");
		ns.add("Sonu");
		ns.add("Swapnali");
		ns.add("Sonu");
		ns.add("Ab");
		System.out.println("Navigable Set String = "+ns);
		System.out.println("Navigable Set Descending Order = "+ns.descendingSet());





	}

}
