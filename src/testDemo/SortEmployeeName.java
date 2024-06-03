package testDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeeName {




	public static void main(String[] args) {

		List<String>employeeName=Arrays.asList("Swapnali","Dadaso","Asha","Zebra","Dolly","Banagar");
		System.out.println("Original ArrayList:"+employeeName);

		Collections.sort(employeeName);
		System.out.println("Sorted ArrayList:"+employeeName);
	}

}
