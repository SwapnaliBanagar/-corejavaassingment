package controller;

/*
 * public class Star {
 * 
 * public static void main(String[] args) {
 * 
 * for(int i=1; i<=10;i++) { for( int j=1; j<=i; j++) { System.out.print("*"); }
 * System.out.println(); }
 * 
 * }
 * 
 * }
 */
import java.util.*;


public class Star {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
      sc.close();
   }
}


