package languageFundaments;

public class MainMethodDemo {

	//static synchronized final strictfp public void main(String...sona)
	//static  public void main(String...sona)
	 final public strictfp static  void main(String[]args)
	{
		System.out.println("Valid Main Method");
	}
}
//---------valid main method possibilities
//Instead of change position of public and static 
//public static void main(String args[])
//static public void main(String args[])

//We can declare String[] any acceptable form
// 1: public static void main(String args[])
// 2: public static void main(String[] args)
// 3:  public static void main(String []args)

//Instead of args we can take any valid java identifier
// public static void main(String[] sona)


//We can replace String[] to var-arg parameter
//public static void main(String... args)


//we can use final, synchronized,strictfp
//static synchronized final strictfp public void main(String...sona)
//public final strictfp static  void main(String...sona)
//final public strictfp static  void main(String[]args)