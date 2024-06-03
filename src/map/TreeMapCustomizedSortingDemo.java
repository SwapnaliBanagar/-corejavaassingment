package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomizedSortingDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> t=new TreeMap<Integer, String>( new MyComparator());
		t.put(101, "A");
		t.put(110, "B");
		t.put(180, "C");
		t.put(100, "O");
		t.put(102, "Z");
		System.out.println(t); // print keyValue using Customized sorting order based on key
	}
}

class MyComparator implements Comparator<Object>
{

	public int compare(Object obj1, Object obj2)
	{

		Integer i1=(Integer)obj1;//---------------(Integer)  means type Casting 
		// using type casting to convert Object to WrapperClass
		Integer i2=(Integer)obj2;
		return  i2.compareTo(i1);


	}
}
