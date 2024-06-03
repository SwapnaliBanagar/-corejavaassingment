package list;
import java.util.List;
import java.util.ArrayList;
public class ListExample {

	public static void main(String[] args) {

		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);


		List<String>name=new ArrayList<>();
		name.add("Sonu");
		name.add("Sonu");
		name.add("Swapnali");
		name.add("Sonu");
		System.out.println(name);

		//In List Duplicates Are allowed;
		//And Insertion Order is Preserved;	

	}
}




