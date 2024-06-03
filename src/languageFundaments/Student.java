package languageFundaments;


public class Student {
	String name;
	int rollNo;
	Student(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}

	public static void main(String[] args) {

		Student s1=new Student("durga",101);
		Student s2=new Student("ravi",102);

		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}


}


