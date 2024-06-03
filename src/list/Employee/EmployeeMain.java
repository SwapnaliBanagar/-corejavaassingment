package list.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<EmployeeDto> employeeDeatails= EmployeeInfo.getEmployeeInfo();
		Collections.sort(employeeDeatails , new MyComparator());
		for(EmployeeDto e:employeeDeatails)
		{
			System.out.println("EmployeeName:"+e.getEmployeeName() +"\nCompanyName:"+e.getCompanyName() +"\nDepartment:"+e.getDepartment() +"\nSalary:"+e.getSalary() +"\nExperience:"+e.getExperience());
			System.out.println("________________________________________________________________________________________________________________");
		}



		System.out.println("************************************************--IT-Department--*****************************");

		for(EmployeeDto e:employeeDeatails)
		{
			if(e.getDepartment().equalsIgnoreCase("IT"))
			{
				System.out.println("EmployeeName:"+e.getEmployeeName() +"\nCompanyName:"+e.getCompanyName() +"\nDepartment:"+e.getDepartment() +"\nSalary:"+e.getSalary() +"\nExperience:"+e.getExperience());
				System.out.println("________________________________________________________________________________________________________________");
			}
		}




		System.out.println("************************************************--IT-Department Highest Salary --*****************************");

		
		for(int i=0; i<employeeDeatails.size(); i++)
		{
			if(i==0)
			{
				for(EmployeeDto e:employeeDeatails)
				{
					if(e.getDepartment().equalsIgnoreCase("IT"))
					{					
						System.out.println("EmployeeName:"+e.getEmployeeName() +"\nCompanyName:"+e.getCompanyName() +"\nDepartment:"+e.getDepartment() +"\nSalary:"+e.getSalary() +"\nExperience:"+e.getExperience());
						System.out.println("________________________________________________________________________________________________________________");
						break;
					}
				}
			}
		}




		System.out.println("************************************************--IT-Department Average_Salary --*****************************");

		double averageSalary=0.0;
		int count=0;
		for(EmployeeDto e:employeeDeatails)
		{
			if(e.getDepartment().equalsIgnoreCase("IT"))
			{
				averageSalary=averageSalary+(e.getSalary());
				count++;
			}
		}
		System.out.println("IT-Department Total_Employee:"+count);
		System.out.println("IT-Department Total_Salary:"+averageSalary);
		System.out.println("IT-Department Average_Salary:"+averageSalary/count);   //------formula for AverageSalary(tolatSalary/totalEmployee)
		System.out.println("\n________________________________________________________________________________________________________________");

		
		
		
		
		System.out.println("************************************************--HR-Department--*****************************");

		for(EmployeeDto e:employeeDeatails)
		{
			if(e.getDepartment().equalsIgnoreCase("HR"))
			{
				System.out.println("EmployeeName:"+e.getEmployeeName() +"\nCompanyName:"+e.getCompanyName() +"\nDepartment:"+e.getDepartment() +"\nSalary:"+e.getSalary() +"\nExperience:"+e.getExperience());
				System.out.println("________________________________________________________________________________________________________________");
			}
		}

		
		
		
		
	}
}
