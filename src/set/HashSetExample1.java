package set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample1 {

	public static void main(String[] args) {
		HashSet<Comparable> h=new HashSet<>();
		h.add(7);
		h.add("Swap");
		h.add(2);
		h.add("Asha");
		h.add(null);
		h.add(10);
		//System.out.println(h.add(10)); --------------Duplicates Not Allowed
		System.out.println(h); //----------------------Insertion order is Not preserved


		System.out.println(" ");
		System.out.println("_______________Contain Check_______________");
		System.out.println(h.contains("Asha"));//-------In this list This Contain are Present Or not preset=true -- not present=false
		
		System.out.println("  ");
		System.out.println("_______________remove_____________________");
		h.remove("Asha");
		System.out.println(h);
		
		System.out.println("  ");
		System.out.println("_______________iterator_____________________");
		Iterator i =h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
				
		System.out.println("  ");
		System.out.println("_______________Size_____________________");
		System.out.println(h.size());
		
		System.out.println("  ");
		System.out.println("_______________hashCode_____________________");
		System.out.println(h.hashCode());
	}

}
