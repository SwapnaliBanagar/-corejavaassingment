package exceptionDemo;

public class ControlFlowCase1 {
                                                //Case1:their is no any Exception
	public static void main(String[] args) {
		try
		{
		System.out.println("Statement1");
		System.out.println("Statement2");
		System.out.println("Statement3");
		}
		catch(Exception e)
		{
			System.out.println("Statement4");
		}
		System.out.println("Statement5");

	}

}
