package list.Employee;

import java.util.ArrayList;

public class EmployeeInfo {

	public static ArrayList<EmployeeDto> getEmployeeInfo()
	{
		ArrayList<EmployeeDto>empList=new ArrayList<>();
		empList.add(new EmployeeDto("Swapnali_Banagar", "TCS", "IT", 50000, 3));
		empList.add(new EmployeeDto("Gauri_Dhere", "TCS", "HR", 100000, 10));
		empList.add(new EmployeeDto("Dadaso_Banagar", "TCS", "IT", 80000, 8));
		empList.add(new EmployeeDto("Rani_Gutukade", "TCS", "Electronics", 20000, 2));
		empList.add(new EmployeeDto("Samadhan_Dhere", "TCS", "IT", 60000, 5));
		empList.add(new EmployeeDto("Virat_Kohali", "TCS", "Sport", 10000, 1));
		empList.add(new EmployeeDto("Sakshi_Dhoni", "TCS", "IT", 90000, 9));

		return empList; 
	}	
}
