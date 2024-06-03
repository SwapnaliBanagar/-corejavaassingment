package map;
import java.util.LinkedHashMap;
public class LinkedhashMapExaample {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		lhm.put("Sona", 102);
		lhm.put("Asha", 105);
		lhm.put("Riya", 101);
		lhm.put("Dolly", 107);
		System.out.println(lhm); //----Insertion Order is Preserved
	}
}
