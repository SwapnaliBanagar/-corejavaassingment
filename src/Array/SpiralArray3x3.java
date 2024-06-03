package Array;

import java.util.Scanner;

public class SpiralArray3x3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Matrix");
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int matrix[][]=new int [rows][columns];
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<columns; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("----Output----");
		int j=0;
		int k=0;
		for(int i=0; i<1;i++)
		{
			for( j=0; j<columns; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
				for( k=1; k<=columns-1; k++)
				{
					System.out.print(matrix[k][j-1]+" ");	
				}
				for(int l=1; l>=0; l--)
				{
					System.out.print(matrix[k-1][l]+" ");	
				}
				for(int m=0; m<columns-1; m++)
				{
					System.out.print(matrix[k-2][m]+" ");	
				}
				sc.close();
			}
			
		}
	}


