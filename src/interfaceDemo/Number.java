package interfaceDemo;


interface NumberDemo
{
	final int a =10;
	public void display();
}

public class Number implements NumberDemo {

	public void display() {

		System.out.println("Swap");
		System.out.println(a);
	}
	public static void main(String[] args) {
		Number n=new Number();
		n.display();
	}

}
