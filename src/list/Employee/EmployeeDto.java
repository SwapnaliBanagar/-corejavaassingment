package list.Employee;

public class EmployeeDto {

	private String employeeName;
	private String companyName;
	private String department;
	private double salary;
	private int experience;




	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}



	public EmployeeDto(String employeeName, String companyName, String department, double salary, int experience) {
		super();
		this.employeeName = employeeName;
		this.companyName = companyName;
		this.department = department;
		this.salary = salary;
		this.experience = experience;
	}


	
}



