package testDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeNameDemoMain {

	public static void main(String[] args) {
		List<EmployeeNameDemo>joiningDateList=new ArrayList<EmployeeNameDemo>();
		joiningDateList.add(new EmployeeNameDemo("25/3/2021"));
		joiningDateList.add(new EmployeeNameDemo("25/4/2021"));
		joiningDateList.add(new EmployeeNameDemo("24/1/2024"));
		joiningDateList.add(new EmployeeNameDemo("29/8/2034"));
		joiningDateList.add(new EmployeeNameDemo("11/12/1999"));
		
		Collections.sort(joiningDateList);
		
		
		
		
		
		  for(EmployeeNameDemo employee:joiningDateList) {
		  System.out.println("JoiningDate:"+employee.getJoiningDate()); }
		 
		
		
		
		
		/*
		 * ListIterator itr=joiningDateList.listIterator(); //-----------------this way also use to print Array
		 * 
		 * while(itr.hasNext()) { EmployeeNameDemo
		 * employee=(EmployeeNameDemo)itr.next();
		 * System.out.println("JoiningDate:"+employee.getJoiningDate()); }
		 */
		
		
		
		

	}

}
