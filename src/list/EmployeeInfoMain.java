package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeInfoMain {

	public static void main(String[] args) {
		List<EmployeeInfo> employeeInfoList=new ArrayList<>();
		EmployeeInfo employeeInfo = new EmployeeInfo(1,20,2000.00,2021,"java developer");
		EmployeeInfo employeeInfo1 = new EmployeeInfo(2,20,2000.00,2021,"java developer");
		EmployeeInfo employeeInfo2 = new EmployeeInfo(3,20,2000.00,2021,"java developer");
		EmployeeInfo employeeInfo3 = new EmployeeInfo(4,20,2000.00,2021,"java developer");
		EmployeeInfo employeeInfo4 = new EmployeeInfo(5,20,2000.00,2021,"java developer");
		EmployeeInfo employeeInfo5 = new EmployeeInfo(6,20,2000.00,2021,"java developer");
		employeeInfoList.addAll(Arrays.asList(employeeInfo,employeeInfo1,employeeInfo2,employeeInfo3,employeeInfo4,employeeInfo5));
		

		for(int i=0; i<=employeeInfoList.size()-1; i++)
		{
			if(employeeInfoList.get(i).employeeId==3)
			{
				System.out.println("----------------For Employee"+(i+1)+"--------------------------");
				System.out.println("employeeId:"+employeeInfoList.get(i).employeeId);
				System.out.println("age:"+employeeInfoList.get(i).age);
				System.out.println("salary:"+employeeInfoList.get(i).salary);
				System.out.println("dateOfJoining:"+employeeInfoList.get(i).dateOfJoining);
				System.out.println("designation:"+employeeInfoList.get(i).designation);

			}
			else
			{
				System.out.println("----------------For Employee"+(i+1)+"--------------------------");
				System.out.println("employeeId:"+employeeInfoList.get(i).employeeId);
				System.out.println("age:"+employeeInfoList.get(i).age);
				System.out.println("salary:"+employeeInfoList.get(i).salary);
				System.out.println("dateOfJoining:"+employeeInfoList.get(i).dateOfJoining);
				System.out.println("designation:"+employeeInfoList.get(i).designation);

			}

		}

	}

}
