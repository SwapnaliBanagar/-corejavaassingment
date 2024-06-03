package exceptionDemo;

public class DefaultException3 {

	public static void main(String[] args) {
		doStuff();
		System.out.println(10/0);   //----------Error occur in main() Method , this method is abnormally Terminated that mean program is abnormally terminated
	}
	public static void doStuff()
	{
		doMoreStuff();
		System.out.println("Hii");
	}
	public static void doMoreStuff()
	{
		System.out.println("Hello");
		System.out.println("SWapnali");
	}

}
