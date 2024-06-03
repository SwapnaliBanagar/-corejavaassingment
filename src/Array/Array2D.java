package Array;

import java.util.Scanner;

public class Array2D {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Matrix Size");

		int rows = sc.nextInt();

		int columns = sc.nextInt();

		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Your X Value");
		int x = sc.nextInt();
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (matrix[i][j] == x) {
					System.out.println("X location = (" + i + "," + j + ")");
				}
				sc.close();
			}
		}

	}
}
