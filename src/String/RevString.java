package String;

public class RevString {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Swapnali");
		System.out.println("Original String = " + sb);
		String revString = "";

		for (int i = sb.length() - 1; i >= 0; i--) {
			revString=revString+sb.charAt(i);			
		}
		System.out.println("Reversed String = "+revString);
	}
}
