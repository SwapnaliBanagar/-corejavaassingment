package list;

import java.util.ArrayList;
import java.util.List;

class Student
{
	int seatNo;
	String collageName;
		String branchName;
	String studentName;

	public Student( int seatNo,String collageName, String branchName, String studentName) {

		this.seatNo = seatNo;
		this.collageName = collageName;
				this.branchName = branchName;
		this.studentName = studentName;

	}

	@Override
	public String toString() {
		return "Student [seatNo=" + seatNo + ",collageName=" + collageName + ", branchName=" + branchName
				+ ", studentName=" + studentName + "]";
	}
} 


public class StudentDetails {

	public static void main(String[] args) {
		List<Student>studentList=new ArrayList<>();
		Student s1=new Student(1231,"DY Patil","ENTC","Swapnali Banagar");
		Student s2=new Student(1625,"GSM","CIVIL","Swap Banagar");
		Student s3=new Student(5245,"KARMYOGI","COM","Gauri Dhere");
		Student s4=new Student(5233,"YASHODA","IT","Sam");
		Student s5=new Student(52443,"GAURI-SHANKAR","ENTC","Rani Dhere");
		
		studentList.add(s1);	
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		for(int i=0; i<studentList.size(); i++)
		{
			System.out.println("seatNo:"+studentList.get(i).seatNo  +"\ncollageName:"+studentList.get(i).collageName  +"\nbranchName:"+studentList.get(i).branchName  +"\nstudentName:"+studentList.get(i).studentName);
			System.out.println("---------------------------------------------------------------------------------");
		}

	}

}
