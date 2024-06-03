package exceptionDemo;

public class MutipleCatchBlock {

	public static void main(String[] args) {
		String name=null;
		String sirname ="Banagar";
		try
		{ 
			if(name.equalsIgnoreCase(sirname)) {
				System.out.println("name and sirname Same");
			}
			else
			{
				System.out.println("name and sirname Different");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("/by zero is not possible");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
