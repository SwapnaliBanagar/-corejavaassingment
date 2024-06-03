package set;
import java.util.LinkedHashSet;
public class LinkedHashSetExample1 {

	public static void main(String[] args) {
		LinkedHashSet<Comparable> lh = new LinkedHashSet();
		lh.add(10);
		lh.add("Swap");
		lh.add("A");
		lh.add(null);
		lh.add(null);
		lh.add(7);
		System.out.println(lh);//----------------insertion order is preserved, duplicates Not allowed, only one null value allowed
 
	}

}
