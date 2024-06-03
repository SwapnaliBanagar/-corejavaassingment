package languageFundaments;

public class Var_argMethodDemo2 {

	public static void main(String[] args) {
		sum();
		sum(10, 20);
		sum(10,20,30);
		sum(50,50);

	}

	public static void sum(int... x) 
	{

		int total = 0;
		for (int y : x) {
			total = total + y;
		}
		System.out.println("The Sum Of = " + total);

	}

}
