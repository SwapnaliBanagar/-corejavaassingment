package Function;
import java.util.Scanner;
public class Divisor {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Two Numbers");
int number1=sc.nextInt();
int number2=sc.nextInt();
	int division=div(number1,number2);
	System.out.println("GCD = "+division);
	
	sc.close();
}


public static int div(int number1,int number2)

{  int a;
	if(number1<number2)
	{
		a=number1;
	}
	else
	{
		a=number2;
	}
	for(int i=a; i>1; i--)
	{
		if(number1%a==0 && number2%a==0) {
		

			return i;
		
	}
	}
	return 1;
}
}

