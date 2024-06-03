package list;

public class EmployeeInfo {
	int employeeId;
	int age;
	double salary;
	int dateOfJoining;
	String designation;
	public EmployeeInfo(int employeeId, int age, double salary, int dateOfJoining, String designation) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.designation = designation;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(int dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/*
	 * @Override public String toString() { return "EmployeeInfo [employeeId=" +
	 * employeeId + ", age=" + age + ", salary=" + salary + ", dateOfJoining=" +
	 * dateOfJoining + ", designation=" + designation + "]"; }
	 */

}
