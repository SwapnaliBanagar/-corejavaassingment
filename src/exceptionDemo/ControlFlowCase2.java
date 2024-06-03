package exceptionDemo;

public class ControlFlowCase2 {
                                                     //case2: Exception occurs in st2 catch block matched
	public static void main(String[] args) {
		try
		{
			System.out.println("Statement1");
			System.out.println(10/0);
			System.out.println("Statement3");
		}
		catch(Exception e)
		{
			System.out.println("Statement4");
		}
		System.out.println("Statement5");
	}

}
