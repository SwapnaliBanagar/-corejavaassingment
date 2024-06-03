package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String args[])
	{
		
		SortedMap<Integer,String> s=new TreeMap<Integer,String>();
		s.put(101, "A");
		s.put(103, "B");
		s.put(104, "C");
		s.put(100, "A");
		s.put(125, "E");
		s.put(136, "F");
		System.out.println(s);//------------print Default Nature Sorting order----Duplicate key not allowed but duplicate Value is allowed
		System.out.println("-------------------------------------------------------------");
		System.out.println(s.firstKey());//-------print only First key
		System.out.println("-------------------------------------------------------------");
		System.out.println(s.lastKey());//--------print only Last key
		System.out.println("-------------------------------------------------------------");
		System.out.println(s.headMap(103));//-----print head keyValue <e
		System.out.println("-------------------------------------------------------------");
		System.out.println(s.tailMap(103));//----print tail keyValue e<=
		System.out.println("-------------------------------------------------------------");
		System.out.println(s.subMap(103, 125));//----Print keyValue between the e<=to >e //subMap(Integer fromKey, Integer toKey)
		System.out.println("-------------------------------------------------------------");
		System.out.println(s.replace(103, "BB"));//-------------replace Value And returns Old Value
		System.out.println(s);//--------------------------------After replacing Map
		System.out.println("-------------------------------------------------------------");
	}

}
