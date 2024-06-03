package map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(102, null);
		hm.put(103, "Sona");
		hm.put(104, "Asha");
		hm.put(107, "ZZZ");
		hm.put(null, "XXX");//--------------only one null key is allowed
		hm.put(197, "ooo");
		hm.put( 110,null);//-----------------Any Numbers of Time null Value is allowed
		System.out.println(hm);//---------------insertion order is NOT preserved 
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Only key = "+hm.keySet());//-----------Only key
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Only values = "+hm.values());///----------------only values
		
		System.out.println("--------------------------------------------------------------");
		Map<Integer, String> m=Collections.synchronizedMap(hm);//-----------------Hash map is Non-Synchronized but using the Collections.synchronizedMap() method HashMap is Synchronized
		System.out.println("Synchronized = "+m);
		
		for(Map.Entry<Integer, String>iterater:hm.entrySet())        //---------iterate Map
		{
			System.out.println(iterater.getKey() +"="+iterater.getValue());	
		}
		
	}
}
