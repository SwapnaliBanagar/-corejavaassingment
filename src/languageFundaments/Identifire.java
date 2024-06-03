package languageFundaments;

public class Identifire {

	public static void main(String[] args) {
		int number=10;
		System.out.println(number);//mostly use this case
		System.out.println("--------------------------------------------------");
		
		
		int Number=10;
		System.out.println(Number);
		System.out.println("--------------------------------------------------");
		
		
		
		int NUMBER=10;
		System.out.println(NUMBER);
		//number,Number ,NUMBER, all variables is allowed because java is case sensitive language
		System.out.println("--------------------------------------------------");
		
		
		
		//int 12Number=10;
		//System.out.println(Number);
		//This type of variable(Identifier) is not allowed because variable do not start with digit
		

		int x=10;//-----Valid
		System.out.println(x);
		// int if=10;//-----Invalid because if is a reserved word(Key word)
		//we can't use reserved word as identifier
		System.out.println("---------------------------------------------------");
		
		System.out.println("Which can valid or invalid");
		
		int total_number=10;
		System.out.println("total_number = "+total_number+"  ----It is Valid");
		
		
		/*
		 * int total#=10; System.out.println("total# = "+total#+"  ----It is Invalid");
		 */
		
		int ca$h=10;
		System.out.println("ca$h = "+ca$h+"  ----It is Valid");
		
		boolean b=true;//------------------valid
		//boolean b1="True";----------------invalid
		
		
		//char ch=null;----------------compiletime error
		
		
		
	System.out.println("Swapnali"+"\n"+"banager");	//---------------------------new line print 
		System.out.println("Swapnali"+"\t"+"banager");//--------------------Horizontal print
		System.out.println("Swapnali"+"\r"+"banager");//------------carriage returns same as new line
		System.out.println("Swapnali"+"\b"+"banager");//------------back space
		System.out.println("Swapnali"+"\\"+"banager");//------------back slash
		
	}

}
