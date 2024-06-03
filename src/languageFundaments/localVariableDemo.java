package languageFundaments;

public class localVariableDemo {

	public static void main(String[] args) {
		int i=0;
		
		for(int j=0; j<3; j++)
		{
			i=i+j;
		}
		//System.out.println(i+" "+j);//-------------compile time error local variable can not be access outside the block,method,constructor

	}

}
