package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StringMapDemo {
	public static void main(String[] args) {

		List<String> s=Arrays.asList("A","AAA","AA","AAAA");

		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0; i<s.size(); i++)
		{                                               
			String name=s.get(i);                 
			hm.put(name,name.length());
		}
		/*
		 * for(Map.Entry<String, Integer> result:hm.entrySet()) {
		 * System.out.println(result.getKey()+"="+result.getValue()); }   //This is simple Way I want to Using Map
		 */
		
		for(int i=0; i<s.size(); i++)
		{                                              
			          
			hm.put(s.get(i).toString(),s.get(i).toString().length());
		}
		System.out.println(hm);
	}

}

