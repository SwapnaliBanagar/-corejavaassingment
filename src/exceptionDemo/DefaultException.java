package exceptionDemo;

public class DefaultException {

	public static void main(String[] args) {
		  doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
		
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);         //----------Error occur in doMoreStuff Method , this method is abnormally Terminated that mean program is abnormally terminated
	}

}
