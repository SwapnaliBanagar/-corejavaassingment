package oops;



class Parent
{
	public void m1()
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	public void m2()
	{
		System.out.println("Child");
	}
}


public class InheritanceDemo {
 public static void main(String args[])
 {
	 Parent p =new Parent();
			 p.m1();  //------o/p--parent
	//	 p.m2; //------------Parent class m2 method is not present
			 
	Child c=new Child();
	c.m1();     //-----------o/p--parent
	c.m2();     //-----------o/p--child
	
	Parent p1=new Child();//-------------------------parent class hold child class but method access only parent class
	p1.m1();  //-----------o/p--parent
	//p1.m2();   //-----------------method access only parent class
	
	
	// Child c1 =new Parent();//-----------------------Child class can not hold Parent class;
	
 }
}
