package exceptionDemo;

import java.util.Scanner;

public class UserId {

	public static void main(String[] args) {
		int UserId=1234;
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre Your UserId");
		int userId=sc.nextInt();
		
		if(userId==UserId)
		{
			System.out.println("Welcome in Wipro Company");
		}
		else
		{
			throw new UserIdException("Wrong UserId");
		}

	}

}
