package Ifelse;

public class Grading {
	public static void main(String args[])
	{
		int mark=101;
		if(mark<35)
		{
			System.out.println("You  are Fail");
		}
		else if(mark>=35&&mark<=50)
		{
			System.out.println("D gread");
		}
		else if(mark>=51&&mark<=70)
		{
			System.out.println("C gread");
		}
		else if(mark>=71&&mark<=80) 
		{
			System.out.println("B gread");
		}
		else if(mark>=81&&mark<=94)
		{
			System.out.println("A gread");
		}
		else if(mark>=95&&mark<=100)
		{
			System.out.println("A+");
		}
		else {
			System.out.println("Please Try Again");
		}
	}

}
