package testDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeNameDemo implements Comparable<EmployeeNameDemo> {
	LocalDate joiningDate;

	public EmployeeNameDemo(String joiningDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		this.joiningDate = LocalDate.parse(joiningDate, formatter);
	}


	public LocalDate getJoiningDate() 
	{
		return joiningDate;
	}



	@Override
	public int compareTo(EmployeeNameDemo employee) {
		return this.joiningDate.compareTo(employee.joiningDate);
		
	}

}

