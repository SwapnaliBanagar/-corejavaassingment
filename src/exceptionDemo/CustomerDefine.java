package exceptionDemo;
import java.util.Scanner;
public class CustomerDefine  {

	public static void main(String[] args) {
		String username="Swapnali@123";
		String pass="Swap123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your UserName");
		String username2=sc.nextLine();
		System.out.println("Enter Your Password");
		String pass2=sc.nextLine();
		
		if (username.equalsIgnoreCase(username2)&&pass.equals(pass2))
		{
			System.out.println("Login Scussecfully");
			sc.close();
		}
		else
		{
			throw new ForgotPasswordException("wrong password");
		}
		

	}
	 
		 


}
