package oops;


class A
{
	public void m1()
	{
		System.out.println("Parent");
	}

}
class B extends A
{
	public void m2()
	{
		System.out.println("child");
	}
}

public class Test {
	public static void main(String[] args) {
		A a=new A();
		a.m1();

		B b =new B();
		b.m1();
		b.m2();

		A a1=new B();
		a1.m1();
	}
}
