package oops;

//-------------multipleInheritance---------------//
class X
{
	public void m1()
	{
		System.out.println("X class");
	}
}
class Y extends X
{
	public void m2()
	{
		System.out.println("Y class");
	}
}
class Z extends Y
{
	public void m3()
	{
		System.out.println("Z class");
	}
}

public class Test2 {
	public static void main(String[] args) {

		X x=new X();
		x.m1();

		Y y=new Y();
		y.m1();
		y.m2();

		Z z=new Z();
		z.m1();
		z.m2();
		z.m3();
	}
}
