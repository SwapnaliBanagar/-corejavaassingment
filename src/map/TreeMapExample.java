package map;
import java .util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<>();
		t.put(101, "A");
		t.put(110, "B");
		t.put(180, "C");
		t.put(100, "O");
		t.put(102, "Z");
		//t.put(null, "K");//----------------------null is not allowed otherwise NullPointerException
		System.out.println(t);// print keyValue using Default Nature sorting order based on key
		System.out.println("-----------------------------------------------------------------");
		System.out.println("size = "+t.size());//------print number of size of keyValue pair(Entry)

	}

}
