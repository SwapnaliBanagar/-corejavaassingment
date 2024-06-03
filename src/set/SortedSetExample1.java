package set;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetExample1 {
public static void  main(String args[])
{
	
	SortedSet<Integer> st=new TreeSet<>();
	st.add(100);
	st.add(101);
	st.add(103);
	st.add(115);
	st.add(107);
	st.add(110);
	st.add(104);
	System.out.println("Original = "+st);//----------Insertion order is not preserved----
	System.out.println("first = "+st.first());
	System.out.println("last = "+st.last());
	System.out.println("head = "+st.headSet(107));
	System.out.println("tail = "+st.tailSet(104));
	System.out.println("subset = "+st.subSet(100, 107));
	System.out.println("comparator = "+st.comparator());//-------using Default Nature Sorting then comparator it will null
}
}
