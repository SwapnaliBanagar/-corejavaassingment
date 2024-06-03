package testDemo;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Object>

{
	@Override
	public int compare(Object employee1, Object employee2) {
		Employee e1=(Employee)employee1;
		Employee e2=(Employee)employee2;
		
		//return e1.name.compareTo(e2.name); //---------Ascending order
		return e2.name.compareTo(e1.name);   //--------Descending Order
	}

}
