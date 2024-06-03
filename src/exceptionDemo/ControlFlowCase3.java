package exceptionDemo;

public class ControlFlowCase3 {
	                                                //case3: Exception occurs in st2, catch block  NOT matched
	public static void main(String[] args) {
		try
		{
			System.out.println("Statement1");
			System.out.println(10/0);
			System.out.println("Statement3");
		}
		catch(NullPointerException e)
		{
			System.out.println("Statement4");
		}
		System.out.println("Statement5");
	}

}

	
