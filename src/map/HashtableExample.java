package map;
import java.util.Hashtable;
public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<>(9);
		h.put(5,"A");
		h.put(15,"D");
		h.put(23,"E");
		h.put(2,"B");
		h.put(6,"C");
		h.put(16,"F");

		//h.put(105, null);//-------------null Value is not allowed otherwise NullPointerException
		//h.put(null, "N");----------------null Key is not allowed otherwise NullPointerException
		System.out.println(h);//----------------insertion order is not preserved it is based on HashCode

	} 

}
