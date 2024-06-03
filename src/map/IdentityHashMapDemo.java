package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<Integer,String>ihm=new IdentityHashMap<>();
		
		Integer i1= new Integer(10);
		Integer i2= new Integer(10);
				
		ihm.put(i1, "Sona");
		ihm.put(i2, "Asha");
		System.out.println("--IdentityHashMap--");
		System.out.println(ihm);//---------------In IdentityHashMap JVM will use == operator to identify duplicates key

	

	System.out.println("------------------------------------------------");
	System.out.println("--HashMap--");
	HashMap<Integer,String>hm=new HashMap<>();
	
	Integer i3= new Integer(10);
	Integer i4= new Integer(10);
			
	hm.put(i3, "Sona");
	hm.put(i4, "Asha");
	
	System.out.println(hm);//---------------In HashMap JVM will use .equals() method to identify duplicates key

}
}	
	
	
	
	
	




