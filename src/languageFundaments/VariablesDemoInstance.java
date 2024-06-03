package languageFundaments;

 class VariablesDemoInstance {
	 
		 int x=10;
		 public static void main(String args[])
		 {
		 //System.out.println(x);//----------invalid compile time error non-static variable x cannot be referenced from a static context

			 VariablesDemoInstance t=new  VariablesDemoInstance();   //----solution of this error
		 System.out.println(t.x);
		 }
		 }


