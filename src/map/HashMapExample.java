package map;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Sona", 102); 
		hm.put("Asha", 105);
		hm.put("Riya", 101);
		hm.put("Dolly", 107);
		System.out.println(hm); //----Insertion Order is NOT Preserved it is Based On hashCode of Keys
	}
}


