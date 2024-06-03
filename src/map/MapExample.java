package map;
import java.util.HashMap;
import java.util.Map;
public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(101, "Sona");
		m.put(104, "Ram");
		m.put(103, "Swap");
		m.put(102, "Ravi");
		System.out.println("Map = "+m);//---------------------------map printing All key-value pairs

		System.out.println("--------------------------------------------------------------");
		System.out.println("get Method = "+m.get(102));//-------------------Get Value Using Key


		System.out.println("--------------------------------------------------------------");
		System.out.println("containsKey Method = "+m.containsKey(103));// containsKey method to check the Key is present or not it is present then returns true otherwise false


		System.out.println("--------------------------------------------------------------");
		System.out.println("containsValue Method = "+m.containsValue("Sam"));//containsValue method to check the  Value is present or not it is present then returns true otherwise false


		System.out.println("--------------------------------------------------------------");
		System.out.println("entrySet Method = "+m.entrySet());//-------------------------------key-value pairs


		System.out.println("--------------------------------------------------------------");
		Map<Integer,String> m2=new HashMap<>();
		m2.put(105, "Sona");
		m2.put(107,"Ram");
		m2.put(106, "Swapnali");
		m2.put(108, "Ravi");
		System.out.println("equals Methos = "+m2.equals(m));//to check all key-value pairs equal or not it is equal then returns true otherwise false

		System.out.println("--------------------------------------------------------------");
		m.putAll(m2);
		System.out.println("putAll Method = "+m);
		
				
		System.out.println("--------------------------------------------------------------");
		System.out.println("keySet = "+m.keySet());//----------------Display Only keys


		
		System.out.println("--------------------------------------------------------------");
		System.out.println("values = "+m.values());//----------Display Only Values

		
		System.out.println("--------------------------------------------------------------");
		System.out.println(m.size());
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("remove Method = "+m.remove(101));//--------------remove Method
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("isEmpty Method = "+m.isEmpty());// Is Empty then returns true otherwise false
		
 







	}

}
