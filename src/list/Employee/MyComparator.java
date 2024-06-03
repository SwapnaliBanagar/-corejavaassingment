package list.Employee;

import java.util.Comparator;

public class MyComparator implements Comparator<EmployeeDto> {



	@Override
	public int compare(EmployeeDto o1, EmployeeDto o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());

	}

}


