package testDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeeAge {

	public static void main(String[] args) {
		List<Integer>age=Arrays.asList(21,45,32,89,42,71,21,90,21);
		System.out.println("Original ArrayList:"+age);
		
		Collections.sort(age);
		System.out.println("Sorted ArrayList:"+age);

	}

}
