package interfaceDemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Bank Name");
		String bankName=sc.nextLine();



		if(bankName.equalsIgnoreCase("SBI"))
		{
			AllBank sbi = new AllBank();
		double sbiRateOfIntrest=sbi.sbi();
		System.out.println(sbiRateOfIntrest);
		
		}
			

		if(bankName.equalsIgnoreCase("HDFC"))
		{
			AllBank hdfc = new AllBank();
			hdfc.hdfc();
		}


		if(bankName.equalsIgnoreCase("ICICI"))
		{
			AllBank icici = new AllBank();
			icici.icici();
		}


		if(bankName.equalsIgnoreCase("AXIS"))
		{
			AllBank axis = new AllBank();
			axis.axis();
		}
		sc.close();
	}
}

