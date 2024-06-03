import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		int size = number;
		int count = 0;
		int originalNumber = number;
		int lastnumber = 0;
		int sum = 0;
		while (size != 0) {                   //using While loop to find the size of number;
			size /= 10;
			count++;
		}
		//System.out.println("Present Number Digit Count = "+count);
		while (originalNumber != 0) {   //...........................//Using this while loop to find the last number one by one
			lastnumber = originalNumber % 10;
			sum += Math.pow(lastnumber, count);
			originalNumber /= 10;
		}
		System.out.println(sum);

		if (sum == number) {
			System.out.println("This is Armstrong Number");
		} else {
			System.out.println("This is NOT a Armstrong Number");
		}
		sc.close();
	}
}

