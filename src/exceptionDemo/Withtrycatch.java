package exceptionDemo;

public class Withtrycatch {

	public static void main(String[] args) {
		System.out.println("Statement1");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ by zero is not Possible");
		}
		System.out.println("Statement"); //--------------program termination is normally

	}

}
