package list;
import java.util.ArrayList;
public class ArraylistExample {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<>();
		System.out.println("Empty ArrayList= "+list);
		System.out.println("-------------------------------------------------------");
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("Add Element Array List");
		System.out.println("Array List = "+list);
		System.out.println("-------------------------------------------------------");

		
		list.add(1, "Gaurav");
		System.out.println("Add element (1,Gaurav)");
		System.out.println(list);
		System.out.println("-------------------------------------------------------");

		
		//Create New ArrayList(list2);
		ArrayList<String>list2=new ArrayList<>();
		list2.add("sonoo");
		list2.add("Hanumat");
		
		
		//adding Second list(list2) to the First ArrayList(list)
		list.addAll(list2);
		System.out.println("Print List1 After adding List2");
		System.out.println(list);
		System.out.println("-------------------------------------------------------");
		
		//Create New ArrayList(list3);
		ArrayList<String>list3=new ArrayList<>();
		list3.add("John");
		list3.add("Rahul");
		
		//addAll first list in position(1,list3);
		list.addAll(1, list3);
		System.out.println("First List = "+list);
		
		

	}
}
