package Array;

import java.util.Arrays;

public class MargeArray {

	public static void main(String[] args) {
		 int a[]={1,2,3,4,5,6};
		 int b[]={7,8,1,5,2};
		  
		 System.out.println("a[]="+Arrays.toString(a));
		 System.out.println("______________________________________________________________");
		 System.out.println("b[]="+Arrays.toString(b));
		 int lengthA=a.length;
		 int lengthB=b.length;
		 int length=lengthA+lengthB;
		 		 
		 int merge[]= new int[length];
		 
		 for(int i=0; i<lengthA; i++)
		 {
			 merge[i]=a[i];
		 	
		 }
		 
		 for(int i=0; i<lengthB; i++)
		 {
			 merge[lengthA+i]=b[i];
		 }
		 System.out.println("______________________________________________________________");
		 System.out.println("Original Array:"+Arrays.toString(merge));
		 System.out.println("______________________________________________________________");
		 Arrays.sort(merge);
		 
		 System.out.println("Sorted Array:"+Arrays.toString(merge));
		 
		 
		 
	}

}
