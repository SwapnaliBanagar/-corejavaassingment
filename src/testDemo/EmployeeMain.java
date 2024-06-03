package testDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList employeeNameList=new ArrayList();
		employeeNameList.add(new Employee("Swapnali",23));
		employeeNameList.add(new Employee("Zebra",21));
		employeeNameList.add(new Employee("Dolly",67));
		employeeNameList.add(new Employee("Asha",90));
		employeeNameList.add(new Employee("Dadaso",43));
		employeeNameList.add(new Employee("Manu",28));
		
		Collections.sort(employeeNameList, new EmployeeComparator());
		
		ListIterator itr=employeeNameList.listIterator();
		System.out.println("Sorted By Name Using Comparator");
		while(itr.hasNext()) 
		{
			Employee e=(Employee)itr.next();
			System.out.println("Name:"+e.name+", "+"Age:"+e.age+" ");
		}
		
	}

}
