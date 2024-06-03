package map;

import java.util.HashMap;


public class HashMapGC {

	public static void main(String[] args) {
		HashMap<Test, String> m= new HashMap<>();
		Test t=new Test();
		m.put(t,"Durga");
		System.out.println(m);

		t=null;
		System.gc();

		System.out.println(m);
	}
}
class Test
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize Method Called");
	}
}






