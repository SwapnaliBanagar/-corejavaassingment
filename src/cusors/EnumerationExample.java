package cusors;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
public class EnumerationExample {

	public static void main(String[] args) {

		// Enumeration Applicable for only Legacy Classes(Vector)

		Vector v= new Vector();
		v.addElement("Sona");
		v.addElement(10);
		v.addElement(null);
		v.addElement("Sona");

		System.out.println(v);
		//Duplicates Are Allowed 
		//insertion order is preserved
		//null insertion allowed
		//Only read method Accessible	

		System.out.println("-------Using Enumeration------");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) { 

			System.out.println(e.nextElement());

		}
		
	}

}
