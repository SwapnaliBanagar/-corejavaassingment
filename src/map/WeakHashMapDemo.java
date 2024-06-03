package map;
import java.util.WeakHashMap;
public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Temp, String> whm= new WeakHashMap<Temp, String>();
		Temp t=new Temp();
		whm.put(t,"Durga");
		System.out.println(whm);
		
		t=null;
		
		System.gc();
		Thread.sleep(1);
		
		System.out.println(whm);
	}
}
class Temp
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


