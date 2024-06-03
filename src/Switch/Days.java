package Switch;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day Name");
		System.out.println("(First letter is Capital)");
		String day = sc.nextLine();
		switch (day) {
		case "Monday":
			System.out.println("Monday is a Start Of Week ");
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Midweek Day");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("WeekEnd");
			break;
		default:
			System.out.println("Please Enter Current Spelling of Day");
		}
	}
}
