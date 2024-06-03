package Array;

import java.util.Scanner;

public class MatrixPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Matrix size");
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int matrix[][]=new int [rows][columns];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("----Output----");
		System.out.println(rows+"x"+columns +" matrix");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
			sc.close();
		}
 
	}
}
