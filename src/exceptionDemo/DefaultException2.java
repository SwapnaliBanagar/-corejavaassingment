package exceptionDemo;

public class DefaultException2 {

	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
		System.out.println(10/0);     //----------Error occur in doStuff Method , this method is abnormally Terminated that mean program is abnormally terminated check console for more information

			}
	public static void doMoreStuff()
	{
		System.out.println("Hello");
	}

}
